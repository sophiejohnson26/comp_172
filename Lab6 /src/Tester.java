public class Tester {
    public static void main(String[] args) {
        GallonJar pennyJar01=new GallonJar();
        String overAddTest01= pennyJar01.addPenny(7001);
        System.out.println("Expected: Jar is full! Got: " + overAddTest01);

        String addTest01=pennyJar01.addPenny(5000);
        System.out.println("Expected: Pennies added. Penny balance is now: 5000 Got: " +addTest01);

        String overRemoveTest01=pennyJar01.removePenny(6000);
        System.out.println("Expected: You can't have a negative balance! Got: "+ overRemoveTest01);


        String removeTest01=pennyJar01.removePenny(2000);
        System.out.println("Expected: Pennies removed. Balance is now 3000. Got: " + removeTest01);

        System.out.println("Expected 30.0. Got: "+ pennyJar01.pennyDollars());


        System.out.println("Expected: 3000. Got: " + pennyJar01.getPennyBalance());

        HalfGallonJar pennyJar02=new HalfGallonJar();
        String overAddTest02= pennyJar02.addPenny(3600);
        System.out.println("Expected: Jar is full! Got: " + overAddTest02);

        String addTest02=pennyJar02.addPenny(1000);
        System.out.println("Expected: Pennies added. Penny balance is now: 1000 Got: " +addTest02);

        String overRemoveTest02=pennyJar02.removePenny(6000);
        System.out.println("Expected: You can't have a negative balance! Got: "+ overRemoveTest02);


        String removeTest02=pennyJar02.removePenny(500);
        System.out.println("Expected: Pennies removed. Balance is now 500. Got: " + removeTest02);

        System.out.println("Expected 5.0. Got: " + pennyJar02.pennyDollars());


        System.out.println("Expected: 500. Got: " + pennyJar02.getPennyBalance());


        QuartJar pennyJar03=new QuartJar();
        String overAddTest03= pennyJar03.addPenny(2000);
        System.out.println("Expected: Jar is full! Got: " + overAddTest03);

        String addTest03=pennyJar03.addPenny(1000);
        System.out.println("Expected: Pennies added. Penny balance is now: 1000 Got: " +addTest03);

        String overRemoveTest03=pennyJar03.removePenny(2000);
        System.out.println("Expected: You can't have a negative balance! Got: "+ overRemoveTest03);


        String removeTest03=pennyJar03.removePenny(200);
        System.out.println("Expected: Pennies removed. Balance is now 800. Got: " + removeTest03);

        System.out.println("Expected 8.0. Got: " + pennyJar03.pennyDollars());


        System.out.println("Expected: 800. Got: " + pennyJar03.getPennyBalance());



        PintJar pennyJar04=new PintJar();
        String overAddTest04= pennyJar04.addPenny(900);
        System.out.println("Expected: Jar is full! Got: " + overAddTest04);

        String addTest04=pennyJar04.addPenny(110);
        System.out.println("Expected: Pennies added. Penny balance is now: 110 Got: " +addTest04);

        String overRemoveTest04=pennyJar04.removePenny(120);
        System.out.println("Expected: You can't have a negative balance! Got: "+ overRemoveTest04);


        String removeTest04=pennyJar04.removePenny(10);
        System.out.println("Expected: Pennies removed. Balance is now 100. Got: " + removeTest04);

        System.out.println("Expected 1.0. Got: " + pennyJar04.pennyDollars());


        System.out.println("Expected: 100. Got: " + pennyJar04.getPennyBalance());
    }


}
