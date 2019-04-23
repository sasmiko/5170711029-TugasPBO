package inheritence;

class Male extends Manusia {

    @Override
    protected void cowok() {
                
        System.out.print("JENIS PEKERJAAN PNS/SWASTA ?: ");
        pekerjaan = scan.next();
   
                
        if ("PNS".equals(pekerjaan)) {
            
            System.out.println("1. GURU/DOSEN ");
            System.out.println("2. PEJABAT ");
            System.out.println("====================");
        }
        if ("SWASTA".equals(pekerjaan)) {
            
            System.out.println("1. KARYAWAN ");
            System.out.println("2. BURUH ");
            System.out.println("====================");
        }

    }
}
