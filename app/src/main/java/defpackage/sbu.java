package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sbu implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public sbu(sbv sbvVar) {
        Object[] objArr = new Object[sbvVar.size()];
        Object[] objArr2 = new Object[sbvVar.size()];
        sgj sgjVarListIterator = sbvVar.entrySet().listIterator();
        int i = 0;
        while (sgjVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public sbr a(int i) {
        return new sbr(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof scn) {
            scn scnVar = (scn) obj;
            sbe sbeVar = (sbe) this.b;
            sbr sbrVarA = a(scnVar.size());
            sgj sgjVarListIterator = scnVar.listIterator();
            sgj sgjVarListIterator2 = sbeVar.listIterator();
            while (sgjVarListIterator.hasNext()) {
                sbrVarA.f(sgjVarListIterator.next(), sgjVarListIterator2.next());
            }
            return sbrVarA.b();
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        sbr sbrVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            sbrVarA2.f(objArr[i], ((Object[]) obj2)[i]);
        }
        return sbrVarA2.b();
    }
}
