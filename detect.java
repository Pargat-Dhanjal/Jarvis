class detect {
    int search(String s, int t1) {
        functions ob = new functions();
        patterns ob1 = new patterns();
        memory ob2 = new memory();
        cal ca = new cal();
        int b = 1403;
        if (s.indexOf("bye") >= 0 || s.indexOf("exit") >= 0 || s.indexOf("see y") >= 0)
            b = -1;
        else if (s.indexOf("namaste") >= 0)
            b = 3;
        else if (s.indexOf("hello") >= 0 || s.indexOf("hi") >= 0 || s.indexOf("hey") >= 0)
            b = 1;
        else if (s.indexOf("help") >= 0)
            b = 2;
        else if (s.indexOf("whatsup") >= 0 || s.indexOf("wassup") >= 0)
            b = 4;
        else if (s.indexOf("are you doing") >= 0)
            b = 5;
            else if (s.indexOf("what can you do") >= 0)
            b = 6;
            else if (s.indexOf("who am i") >= 0 || s.indexOf("whats my name") >= 0)
            b = 7;
            else if (s.indexOf("great") >= 0)
            b = 8;
            else if (s.indexOf("jarvis") >= 0 || s.indexOf("j.a.r.v.i.s") >= 0)
            System.out.print("Yes ! ");
            else if (s.indexOf("made") >= 0 || s.indexOf("maker") >= 0) {
                System.out.println("Oh ! Did I forgot to introduce my self ?");
                System.out.println("I am Jarvis an Artifical Intelegence made in Java by Pargat");
            } else if (s.indexOf("who") >= 0 && s.indexOf("pargat") >= 0) {
                System.out.println("Pargat is the one who made me");
                System.out.println("He is a Developer");
            } else if (s.indexOf("who are you") >= 0 || s.indexOf("Intro") >= 0) {
                System.out.println("Oh ! Did I forgot to introduce my self ?");
                System.out.println("I am Jarvis an Artifical Intelegence Made up of Several Semicolons ");
                System.out.println("You Can Have a short Conversation with me but I always look forward to help you");
                System.out.println("If you want to know what else can I do try asking \"What can you do ?\"");
            } else if (s.indexOf("cal") >= 0 || s.indexOf("calculator") >= 0)
            ca.cal();
            else if (s.indexOf("average") >= 0 || s.indexOf("avg") >= 0)
            ob.avg();
            else if (s.indexOf("dollars to rupees") >= 0 || s.indexOf("$ to inr") >= 0)
            ob.drc();
            else if (s.indexOf("fact") >= 0 || s.indexOf("factors") >= 0)
            ob.fact();
            else if (s.indexOf("temperature") >= 0 || s.indexOf("temp") >= 0)
            ob.temp();
            else if (s.indexOf("pyramid") >= 0 || s.indexOf("patterns") >= 0)
            ob1.patterns();
            else if (s.indexOf("special art") >= 0)
            ob1.funart();
            else if (s.indexOf("thank you") >= 0)
            System.out.println("Mention not ! ");
            else if (s.indexOf("love") >= 0 || s.indexOf("do") >= 0)
                System.out.println("That's a tough Question ! Anyways ");
            else if (s.indexOf("love") >= 0)
                System.out.println("Oh that's great!");
            else
            b = 0;
            if (s.indexOf("remember") >= 0 && s.indexOf("what") >= 0) {
            ob2.disp(t1);
            b = 1403;
        } else if (s.indexOf("forget") >= 0)
            t1 = ob2.forget();
        else if (s.indexOf("remember") >= 0) {
            t1 = ob2.memory(s.substring(s.indexOf("remember") + 9), t1);
            return t1;
        }

        return b;
    }
}