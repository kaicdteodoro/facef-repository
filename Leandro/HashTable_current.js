function LinkedList() {
    var Node = function(element) {
        this.element = element
        this.next = null
    }

    var length = 0
    var head = null

    this.append = function(element) { //adiciona um novo elemento
        var node = new Node(element), // cria um novo objeto do tipo nó
        current 

        if(head === null) { //se a cabeça for nula
            head = node // cabeça recebe novo no criado
        } else { //senao
            current = head //inicia-se uma busca pelo ultimo elemento

            while(current.next) {
                current = current.next
            }

            current.next = node //ultimo elemento recebe o novo no criado
        }
        length++
    }

    this.insert = function(position, element) { //passo posição e o elemento
        if(position >= 0 && position <= length) { //checa se a posição é valida
            var node = new Node(element),
            current = head,
            previous,
            index = 0

            if(position === 0) { //verifica se a posição é 0
                node.next = current //incluindo na cabeça
                head = node //dicloco a lista para direita e insiro um elemento na cabeça
            } else {
                while(index++ < position) { //anda dentro da lisa até encontrar o elemento a ser incluido
                    previous = current
                    current = current.next
                }
                node.next = current //inserção do elemento no meio da lista
                previous.next = node
            }
            length++ //como ele inseriu ele incrementa o comprimento da lista encadeada
            return true
        } else {
            return false
        }
    }

    this.removeAt = function(position) {
        if(position > - 1 && position < length) { //checa se a posição é valida
            var current = head, //declara uma variaval e fala que o no atual é cabeça
            previous,
            index = 0

            if(position === 0) {
                head = current.next //cabeça recebe o elemento atual.next
            } else {
                while(index++ < position) { //anda dentro da lisa até encontrar o elemento a ser removido
                    previous = current
                    current = current.next
                }
                previous.next = current.next
            }
            length-- //como eu removi um no ele tem que decrescero tamanho do "vetor"
            return current.element
        } else {
            return null
        }
    }

    this.remove = function(element) { // remove um elemento
        var index = this.indexOf(element) //precisa achar a posição do elemento a ser removido
        return this.removeAt(index)
    }

    this.indexOf = function(element) { //Busca onde o elemento está
        var current = head, // declara o elemento inicial da busca como sendo a cabeça
        index = 0 // declara index como 0

        while(current) { //enquanto nó atual ...
            if(element === current.element) { //elemento que é o cara que eu passei como paramertro é igual ao elemento do nó atual?
                return index // se for eu retorno a variavel index
            }
            index++ // Index é incrementada
            current = current.next // Ando para o próximo nó.
        }
        return - 1
    }

    this.isEmpty = function() {
        return length === 0 //verficica se o length é = 0
    }

    this.size = function() {
        return length //retorna o valor de length (tamanho da lista encadeada)
    }

    this.getHead = function() {
        return head //retorna a cabeca da lista encadeada
    }

    this.toString = function() {
        var current = head,
        string = ''

        while(current) {
            string += '|'+current.element + '| '
            current = current.next
        }

        return string
    }

    this.print = function() {
        console.log(this.toString())
    }
}

function HashTable() {
    var table = [] //qual posicao do vetor eu vou inserir aquele elemento.

    var ValuePair = function(key, value) {
        this.key = key
        this.value = value //só pode receber 1 cara por vez --> [astolfo,Livia]
        this.toString = function() {
            return '[' + this.key + ' - ' + this.value + ']'
        }
    }

    this.put = function(key, value) {
        var position = loseloseHashCode(key)
        console.log(position + ' ' + key)
        if(table[position] !== undefined){
            table[position].append(value);
        }else{
            table[position] = new LinkedList();
            table[position].append(value);
        }
        
    }

    this.remove = function(key) {
        table[loseloseHashCode(key)] = undefined //remove com base na chave;
    }
    this.removeEl = function(key, value) {
        table[loseloseHashCode(key)].remove(value); //remove com base na chave;
    }

    this.get = function(key) {
        return table[loseloseHashCode(key)] //usar a função de hashing para achar o valor e retornar;
    }

    var loseloseHashCode = function(key) { //Função de hashing fraca baseada em caracteres ASCCI
        var hash = 0
        for(var i = 0; i < key.length; i++) {
            hash += key.charCodeAt(i) 
        }
        console.log(hash)
        return hash % 37

        //LE -> (76+69)/37 e pega o resto
    }

    this.print = function() {
        for(var i = 0; i < table.length; i++) {
            if(table[i] !== undefined) {
                console.log(i + ' : ' + table[i].toString())
            }
        }
    }

    this.size = function() { //imprime o tamanho da vetor -> table.length
        return table.length
    }
}


var hashtable  = new HashTable()

hashtable.put("Livia","livia@uol.com.br")
hashtable.put("astolfo","astolfo@uol.com.br")
hashtable.put("Leandro","leandro.borges@me.com")
hashtable.put("leandro","leandro.borges@me.com")
hashtable.print();





