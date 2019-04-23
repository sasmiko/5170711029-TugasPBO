package inheritence;

class Female extends Manusia {

    @Override
    protected void cewek() {
       
        System.out.print("JENIS PEKERJAAN KARIR/IRT ? : ");
        pekerjaan = scan.next();

        if ("karir".equals(pekerjaan)) {
            
            System.out.println("1. PEGAWAI KANTOR ");
            System.out.println("2. PNS ");
            System.out.println("====================");
        }
        if ("IRT".equals(pekerjaan)) {
            
            System.out.println("1. MASAK ");
            System.out.println("2. NGASUH ANAK");
            System.out.println("====================");
        }
    }
}
