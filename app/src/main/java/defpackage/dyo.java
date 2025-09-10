package defpackage;

import android.os.Binder;
import android.os.Process;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.WorkDatabase;
import j$.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dyo implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dyo(cyl cylVar, int i) {
        this.b = i;
        this.a = cylVar;
    }

    /* JADX WARN: Type inference failed for: r8v15, types: [eby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v91, types: [java.lang.Object, rww] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        lsy lsyVarE;
        int i = 10;
        int i2 = 15;
        boolean z = false;
        int i3 = 0;
        Object objA = null;
        switch (this.b) {
            case 0:
                ebx ebxVar = (ebx) ((nhz) this.a).f;
                if (ebxVar.x != 1) {
                    String str = dyv.a;
                    dwj.b();
                    return true;
                }
                if ((!ebxVar.d() && !ebxVar.c()) || System.currentTimeMillis() >= ebxVar.a()) {
                    return false;
                }
                dwj.b();
                String str2 = dyv.a;
                return true;
            case 1:
                Object obj = this.a;
                ((cyl) obj).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    objA = ((cyl) obj).a();
                    Binder.flushPendingCommands();
                    return objA;
                } finally {
                }
            case 2:
                nhz nhzVar = (nhz) this.a;
                Object obj2 = nhzVar.g;
                ?? r8 = nhzVar.b;
                String str3 = (String) obj2;
                if (r8.l(str3) == 1) {
                    r8.m(2, str3);
                    ecr ecrVar = (ecr) r8;
                    dco dcoVar = ecrVar.a;
                    dcoVar.k();
                    dfq dfqVarD = ecrVar.f.d();
                    dfqVarD.g(1, str3);
                    try {
                        dcoVar.l();
                        try {
                            dfqVarD.a();
                            dcoVar.p();
                            ecrVar.f.f(dfqVarD);
                            r8.i(str3, -256);
                            z = true;
                        } finally {
                            ((ecr) r8).a.n();
                        }
                    } catch (Throwable th) {
                        ecrVar.f.f(dfqVarD);
                        throw th;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(AmbientLifecycleObserverKt.H((WorkDatabase) ((ejs) this.a).a, "next_alarm_manager_id"));
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) ((ejs) this.a).a;
                int iH = AmbientLifecycleObserverKt.H(workDatabase, "next_job_scheduler_id");
                if (iH >= 0) {
                    i3 = iH;
                } else {
                    AmbientLifecycleObserverKt.I(workDatabase, "next_job_scheduler_id", 1);
                }
                return Integer.valueOf(i3);
            case 5:
                Map map = efm.a;
                return new efy(this.a);
            case 6:
                ((ged) this.a).l.h();
                return null;
            case 7:
                ((ged) this.a).m.h();
                return null;
            case 8:
                ged gedVar = (ged) this.a;
                rwc rwcVar = gedVar.e;
                if (rwcVar.h()) {
                    ((oys) rwcVar.c()).f();
                    ges gesVar = gedVar.n;
                    if (gesVar != null) {
                        gesVar.b(gedVar.i);
                    }
                }
                return null;
            case 9:
                Collection.EL.stream(((ged) this.a).f.values()).forEach(new fkj(i2));
                return null;
            case 10:
                Collection.EL.stream(((ged) this.a).g.values()).forEach(new fkj(i2));
                return null;
            case 11:
                TreeMap treeMap = new TreeMap();
                for (hey heyVar : (List) dei.a(((hew) ((hep) this.a).g).a, true, false, new dvj(i))) {
                    Long lValueOf = Long.valueOf(heyVar.a);
                    String str4 = heyVar.b;
                    ltf ltfVar = ltf.UNKNOWN;
                    treeMap.put(lValueOf, (ltf) Enum.valueOf(ltf.class, str4));
                }
                return treeMap;
            case 12:
                sgv sgvVar = irk.a;
                return (Map) Collection.EL.stream(((sbv) this.a).entrySet()).collect(ryv.a(new idv(11), new idv(12)));
            case 13:
                iyu iyuVar = (iyu) this.a;
                fqf fqfVar = iyuVar.l;
                if (fqfVar == null) {
                    return iyuVar.K.a();
                }
                rwc rwcVarED = fqfVar.eD();
                return (!rwcVarED.h() || ((ngq) rwcVarED.c()).d) ? rwcVarED.a(iyuVar.K.a()) : rvk.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj3 = this.a;
                return Boolean.valueOf(((jmp) obj3).b.post(new jcq(obj3, 20)));
            case 15:
                return (pjr) ((kgl) this.a).b.s();
            case 16:
                Object obj4 = this.a;
                synchronized (((lrl) obj4).j) {
                    lsu lsuVar = ((lrl) obj4).r;
                    lsuVar.getClass();
                    lsuVar.b.j();
                    nzf nzfVarA = lsy.a();
                    nzfVarA.g(((lrl) obj4).c);
                    lsu lsuVar2 = ((lrl) obj4).r;
                    lsuVar2.getClass();
                    nzfVarA.h(lsuVar2.b.b());
                    lsyVarE = nzfVarA.e();
                    lsu lsuVar3 = ((lrl) obj4).r;
                    lsuVar3.getClass();
                    ((lrl) obj4).ad("Touched " + lsuVar3.b.toString());
                }
                return lsyVarE;
            case 17:
                return Boolean.valueOf(((lvy) this.a).a.c(true));
            case 18:
                return (tpc) this.a.fr();
            case 19:
                return Boolean.valueOf(((oys) this.a).E.e(null));
            default:
                ozh ozhVar = ((ozk) this.a).j;
                if (ozhVar != null) {
                    ozhVar.h();
                }
                return null;
        }
    }

    public /* synthetic */ dyo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
