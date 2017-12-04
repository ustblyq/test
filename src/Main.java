public class Main {

    public static void main(String[] args) {
        String str = "'YNG' (16-25 Railcard);\n" +
                "'NGC' (Annual Gold Card);\n" +
                "'CRC' (Cambrian Railcard);\n" +
                "'CTD' (Cotswold line Railcard);\n" +
                "'DRD' (Dales Railcard); A:024 C:112\n" +
                "'DCG' (Devon & Cornwall Gold Card); A:123 C:124\n" +
                "'DIS' (Disabled Persons Railcard); A:063 C:064\n" +
                "'DIC' (Disabled Child Railcard); A:063 C:064\n" +
                "'EVC' (Esk Valley Railcard); A:024 C:025\n" +
                "'FAM' (Family & Friends Railcard); A:009 C:010\n" +
                "'HOW' (Heart of Wales Railcard); A:021 C:097\n" +
                "'HRC' (Highland Railcard : North Scotland); A:027 C:097\n" +
                "'HMF' (HM Forces Railcard); A:012 C:013\n" +
                "'JCP' (Jobcentre Plus Travel Discount Card); A:057 C:XXX\n" +
                "'NEW' (Network Railcard); A:048 C:049\n" +
                "'PBR' (Pembrokeshire Railcard); A:021 C:XXX\n" +
                "'SRY' (Young Scot National Entitlement Card); A:117 C:001\n" +
                "'SRN' (Senior Railcard);A:006 C:001\n" +
                "'SCT' (Strathclyde Concessionary); A:087 C:088\n" +
                "'2TR' (Two Together Railcard); minAdults=2; A:042 C:XXX\n" +
                "'VLS' (Valleys Senior Railcard); A:027 C:XXX\n" +
                "'VLC' (Valleys Student Railcard); A:114 C:XXX\n" +
                "'D34' (Visually Impaired/Wheelchair User (34% Concession)); minAdults=2; A:141 C:XXX\n" +
                "'D50' (Visually Impaired/Wheelchair User (50% Concession)); minAdults=1; A:147 C:XXX\n" +
                "'D75' (Wheelchair User (Child)); minChildren=1;A:XXX C:154";

        transfer(str);
    }



    public static void transfer(String str){
        String[] strs = str.split("\\n");
        for(String rail : strs){
            StringBuffer sb = new StringBuffer();
            int index1 = rail.indexOf("'");
            int index2 = rail.indexOf("'",index1+1);
            sb.append(rail.substring(index1+1,index2)+",");
            index1 = rail.indexOf("(");
            index2 = rail.lastIndexOf(")");
            sb.append(rail.substring(index1+1,index2)+",");
            sb.append("GB,false,,");
            index1 = rail.indexOf("minAdults");
            if(index1>0){
                index2 = rail.indexOf(";",index1+10);
                sb.append(rail.substring(index1+10,index2));
            }
            sb.append(",");
            index1 = rail.indexOf("minChildren");
            if(index1>0){
                index2 = rail.indexOf(";",index1+12);
                sb.append(rail.substring(index1+12,index2));
            }
            System.out.print(sb.toString()+"|");


        }
    }
}
