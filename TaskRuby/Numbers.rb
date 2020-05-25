class Numb
    attr_reader :value

    def initialize(number) 
        @value = [number]
    end

    def getNext
        i = 0
        sum = 1
        res = []
        while (i < @value.length-1) do
            if (@value[i] == @value[i+1])
                sum += 1
            else 
                res.push(sum)
                res.push(@value[i])
                sum = 1
            end
            i += 1
        end
        res.push(sum)
        res.push(@value[i])
        @value = res
        
    end

    def to_string
        i = 0
        res = ""
        while (i < @value.length) do
            res += @value[i].to_s
            i += 1
        end
        return res
    end

    
end

def getSequence(amount)
    if (amount > 0)
        s = Numb.new(1)
        i = 0
        while (i < amount) 
            puts s.to_string
            s.getNext
            i += 1
        end
    end
end

amount = gets.encode("UTF-8").chomp.to_i
getSequence(amount)