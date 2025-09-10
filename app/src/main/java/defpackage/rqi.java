package defpackage;

import android.util.ArrayMap;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqi {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    final Object e;
    public final Object f;

    public rqi(ppz ppzVar, qaq qaqVar, qqq qqqVar, ppj ppjVar, Executor executor, pbn pbnVar) {
        this.f = ppzVar;
        this.e = qaqVar;
        this.c = qqqVar;
        this.b = ppjVar;
        this.a = executor;
        this.d = pbnVar;
    }

    public final void a(ppy ppyVar, qaq qaqVar, ppb ppbVar, pou pouVar) {
        String str;
        ppo ppoVarA = ppo.a(pouVar.e.i().e);
        StringBuilder sb = new StringBuilder();
        boolean zB = ppoVarA.b();
        Object obj = this.e;
        sb.append(zB ? ((ppj) ((qaq) obj).a).c : ppoVarA.c() ? ((ppj) ((qaq) obj).a).d : ((ppj) ((qaq) obj).a).b);
        Date date = new Date(ppbVar.b);
        qaq qaqVar2 = (qaq) obj;
        DateFormat dateFormat = ((ppj) qaqVar2.a).l;
        synchronized (dateFormat) {
            str = dateFormat.format(date);
        }
        sb.append(str);
        String str2 = ppbVar.c;
        if (!str2.isEmpty()) {
            sb.append(".");
            sb.append(str2);
        }
        Integer num = (Integer) ((ArrayMap) qaqVar.a).get(pouVar);
        int iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue > 0) {
            String string = Integer.toString(iIntValue);
            ppj ppjVar = (ppj) qaqVar2.a;
            String strA = rnt.A(string, ppjVar.h);
            if (!ppjVar.j || str2.isEmpty()) {
                sb.append(".");
                sb.append(ppjVar.f);
                sb.append(strA);
            } else {
                sb.append("-");
                sb.append(strA);
            }
        }
        String str3 = pouVar.c;
        if (!str3.isEmpty()) {
            sb.append(".");
            sb.append(str3);
        }
        if (ppbVar.e.size() > 1 && iIntValue > 0 && pouVar == ppbVar.d) {
            sb.append(".");
            sb.append(((ppj) qaqVar2.a).g);
        }
        String string2 = sb.toString();
        ppw ppwVar = pouVar.e;
        pqe pqeVarI = ppwVar.i();
        pqeVarI.d();
        ppbVar.toString();
        ppyVar.b(ppwVar, pqe.a(pqeVarI.a, pqeVarI.b, string2, pqeVarI.d, pqeVarI.e), pouVar.d);
    }

    public rqi(qaq qaqVar) {
        jdg jdgVar = new jdg(qaqVar, 3);
        this.a = jdgVar;
        tzx tzxVarC = tzs.c(new qax(jdgVar, 5));
        this.b = tzxVarC;
        tzx tzxVarC2 = tzs.c(new kuh((tzx) jdgVar, tzxVarC, 20));
        this.c = tzxVarC2;
        tzx tzxVarC3 = tzs.c(new qax(jdgVar, 3));
        this.d = tzxVarC3;
        tzx tzxVarC4 = tzs.c(new lbo(tzxVarC2, tzxVarC3, jdgVar, 5, (int[]) null));
        this.e = tzxVarC4;
        this.f = tzs.c(new qax(tzxVarC4, 4));
    }
}
