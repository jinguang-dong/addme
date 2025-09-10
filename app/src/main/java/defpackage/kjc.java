package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjc implements paq {
    private int d;
    private final ovx e;
    private final Object b = new Object();
    private volatile boolean f = false;
    private final Queue c = new LinkedList();
    public final kqj a = new kqj();

    public kjc(int i) {
        this.d = i;
        this.e = new ovx(Integer.valueOf(this.d));
    }

    private final void c(kiz kizVar, kqh kqhVar, szh szhVar) {
        ske.W(kizVar.a(), new kja(this, szhVar, kqhVar), sxo.a);
    }

    public final syu a(kiz kizVar) {
        if (this.f) {
            return kizVar.b();
        }
        szh szhVar = new szh();
        kqj kqjVar = this.a;
        synchronized (kqjVar.a) {
            kqjVar.a(Integer.valueOf(((Integer) kqjVar.d).intValue() + 1));
        }
        kqi kqiVar = new kqi(kqjVar);
        synchronized (this.b) {
            if (this.d <= 0) {
                this.c.add(new kjb(kizVar, kqiVar, szhVar));
                return szhVar;
            }
            rnt.L(this.c.isEmpty());
            int i = this.d - 1;
            this.d = i;
            this.e.a(Integer.valueOf(i));
            c(kizVar, kqiVar, szhVar);
            return szhVar;
        }
    }

    public final void b() {
        synchronized (this.b) {
            kjb kjbVar = (kjb) this.c.poll();
            if (kjbVar == null) {
                int i = this.d + 1;
                this.d = i;
                this.e.a(Integer.valueOf(i));
            } else {
                c(kjbVar.a, kjbVar.b, kjbVar.c);
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
    }
}
