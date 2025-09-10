package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oar {
    private static volatile oar h;
    public final Context a;
    public final Context b;
    public final obc c;
    public final obm d;
    public final obf e;
    public final obq f;
    public final ojh g;
    private final oak i;
    private final oam j;
    private final obw k;

    protected oar(obu obuVar) {
        Object obj = obuVar.a;
        ojl.az(obj, "Application context can't be null");
        Object obj2 = obuVar.b;
        ojl.ay(obj2);
        this.a = (Context) obj;
        this.b = (Context) obj2;
        this.g = ojh.a;
        this.c = new obc(this);
        obm obmVar = new obm(this);
        obmVar.A();
        this.d = obmVar;
        d().w(4, a.bw(oap.a, "Google Analytics ", " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"), null, null, null);
        obq obqVar = new obq(this);
        obqVar.A();
        this.f = obqVar;
        obw obwVar = new obw(this);
        obwVar.A();
        this.k = obwVar;
        oam oamVar = new oam(this);
        obb obbVar = new obb(this);
        oal oalVar = new oal(this);
        oaw oawVar = new oaw(this);
        obe obeVar = new obe(this);
        ojl.ay(obj);
        if (oak.a == null) {
            synchronized (oak.class) {
                if (oak.a == null) {
                    oak.a = new oak((Context) obj);
                }
            }
        }
        oak oakVar = oak.a;
        oakVar.c = new oaq(this);
        this.i = oakVar;
        oac oacVar = new oac(this);
        obbVar.A();
        oalVar.A();
        oawVar.A();
        obeVar.A();
        obf obfVar = new obf(this);
        obfVar.A();
        this.e = obfVar;
        oamVar.A();
        this.j = oamVar;
        obw obwVarE = oacVar.b.e();
        obwVarE.z();
        obwVarE.z();
        if (obwVarE.f) {
            obwVarE.z();
            boolean z = obwVarE.g;
        }
        obwVarE.z();
        oba obaVar = oamVar.a;
        obaVar.z();
        ojl.av(!obaVar.a, "Analytics backend already started");
        obaVar.a = true;
        obaVar.e().b(new ntd(obaVar, 17, null));
    }

    public static oar c(Context context) {
        ojl.ay(context);
        if (h == null) {
            synchronized (oar.class) {
                if (h == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    oar oarVar = new oar(new obu(context, (byte[]) null));
                    h = oarVar;
                    List list = oac.a;
                    synchronized (oac.class) {
                        List list2 = oac.a;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            oac.a = null;
                        }
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Long l = (Long) obh.B.f();
                    if (jElapsedRealtime2 > l.longValue()) {
                        oarVar.d().v("Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), l);
                    }
                }
            }
        }
        return h;
    }

    public static final void f(oao oaoVar) {
        ojl.az(oaoVar, "Analytics service not created/initialized");
        ojl.aq(oaoVar.B(), "Analytics service not initialized");
    }

    public final oak a() {
        oak oakVar = this.i;
        ojl.ay(oakVar);
        return oakVar;
    }

    public final oam b() {
        oam oamVar = this.j;
        f(oamVar);
        return oamVar;
    }

    public final obm d() {
        obm obmVar = this.d;
        f(obmVar);
        return obmVar;
    }

    public final obw e() {
        obw obwVar = this.k;
        f(obwVar);
        return obwVar;
    }
}
