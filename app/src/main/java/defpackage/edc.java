package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edc implements Runnable {
    private final dxj a;
    private final boolean b;
    private final int c;
    private final ejs d;

    public edc(dxj dxjVar, ejs ejsVar, boolean z, int i) {
        dxjVar.getClass();
        this.a = dxjVar;
        this.d = ejsVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        nhz nhzVarD;
        if (this.b) {
            dxj dxjVar = this.a;
            ejs ejsVar = this.d;
            int i = this.c;
            String str = ((ebm) ejsVar.a).a;
            synchronized (dxjVar.f) {
                nhzVarD = dxjVar.d(str);
            }
            dxj.f(nhzVarD, i);
        } else {
            dxj dxjVar2 = this.a;
            ejs ejsVar2 = this.d;
            int i2 = this.c;
            String str2 = ((ebm) ejsVar2.a).a;
            synchronized (dxjVar2.f) {
                if (dxjVar2.b.get(str2) != null) {
                    dwj.b();
                } else {
                    Set set = (Set) dxjVar2.c.get(str2);
                    if (set != null && set.contains(ejsVar2)) {
                        dxj.f(dxjVar2.d(str2), i2);
                    }
                }
            }
        }
        dwj.b();
        dwj.a("StopWorkRunnable");
    }
}
