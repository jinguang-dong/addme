package defpackage;

import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ppn implements pos {
    private static final AtomicInteger a = new AtomicInteger(0);
    private final int b;
    private final ppz c;
    private final pot d;
    private final long e;
    private final long f;
    private final long g;
    private final ppx h;
    private final String i;
    private final String j;
    private final ppu k;
    private final pbn l;
    private boolean m;
    private ppw n;
    private final szh o;
    private final int p;
    private final ppg q;
    private final qaq r;

    public ppn(ppz ppzVar, qaq qaqVar, ppu ppuVar, ppg ppgVar, long j, long j2, long j3, int i, ppx ppxVar, String str, String str2, pbn pbnVar) {
        String strY = prh.y(str2);
        a.I(ppxVar.c(strY == null ? "" : strY));
        this.c = ppzVar;
        this.r = qaqVar;
        this.q = ppgVar;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = ppxVar;
        this.p = i;
        this.i = str;
        this.j = str2;
        this.n = null;
        this.l = pbnVar;
        this.k = ppuVar;
        this.o = new szh();
        prh.y(str2);
        pot potVar = new pot();
        potVar.c = "";
        pqa pqaVar = pqa.a;
        pqaVar.getClass();
        potVar.d = pqaVar;
        potVar.a = j3;
        potVar.f = (byte) (potVar.f | 1);
        potVar.a(j2);
        this.d = potVar;
        this.b = a.incrementAndGet();
    }

    private final ppw m() {
        String strValueOf = String.valueOf(toString());
        pbn pbnVar = this.l;
        pbnVar.f(strValueOf.concat("-create"));
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String strValueOf2 = String.valueOf(new ppp(this.e, this.f, this.g, uuidRandomUUID).a.toString().replace("-", ""));
        String str = this.j;
        String strY = prh.y(str);
        ppw ppwVarA = this.c.a(pqe.a(this.h, this.i, String.valueOf(((ppj) this.r.a).e).concat(strValueOf2), str, strY != null ? strY : ""), this.k);
        pbnVar.g();
        return ppwVarA;
    }

    @Override // defpackage.pos
    public final synchronized long a() {
        ppw ppwVar = this.n;
        if (ppwVar == null) {
            return -1L;
        }
        return ppwVar.a();
    }

    @Override // defpackage.pos
    public final Uri b() {
        ppw ppwVar = this.n;
        return ppwVar == null ? Uri.EMPTY : ppwVar.h();
    }

    @Override // defpackage.pos
    public final syu c() {
        return ske.N(this.o);
    }

    @Override // defpackage.pos
    public final synchronized FileInputStream d() {
        FileInputStream fileInputStreamB;
        rnt.O(!this.m, "Cannot open an input stream after %s has been published or abandoned.", this);
        this.l.f(toString().concat("#openInputStream"));
        if (this.n == null) {
            this.n = m();
        }
        try {
            fileInputStreamB = this.n.b();
            toString();
            fileInputStreamB.toString();
            this.n.i().toString();
            this.l.g();
            szh szhVar = this.o;
            ppw ppwVar = this.n;
            ppwVar.getClass();
            szhVar.e(ppwVar.h());
        } catch (Throwable th) {
            this.l.g();
            throw th;
        }
        return fileInputStreamB;
    }

    @Override // defpackage.pos
    public final synchronized FileOutputStream e() {
        FileOutputStream fileOutputStreamC;
        rnt.O(!this.m, "Cannot open an output stream after %s has been published or abandoned.", this);
        this.l.f(toString().concat("#openOutputStream"));
        if (this.n == null) {
            this.n = m();
        }
        try {
            fileOutputStreamC = this.n.c();
            toString();
            fileOutputStreamC.toString();
            this.n.i().toString();
        } finally {
            this.l.g();
            szh szhVar = this.o;
            ppw ppwVar = this.n;
            ppwVar.getClass();
            szhVar.e(ppwVar.h());
        }
        return fileOutputStreamC;
    }

    @Override // defpackage.pos
    public final synchronized void f() {
        synchronized (this) {
            if (this.m) {
                return;
            }
            this.m = true;
            toString();
            this.q.c(this);
        }
    }

    @Override // defpackage.pos
    public final void g() {
        synchronized (this) {
            if (this.m) {
                return;
            }
            this.m = true;
            pot potVar = this.d;
            ppw ppwVar = this.n;
            ppwVar.getClass();
            potVar.e = ppwVar;
            toString();
            this.q.d(this);
        }
    }

    @Override // defpackage.pos
    public final void h(String str) {
        rnt.O(!this.m, "Cannot set tag after %s has been published or abandoned.", this);
        this.d.c = str;
    }

    @Override // defpackage.pos
    public final synchronized void i(long j) {
        rnt.O(!this.m, "Cannot set timestamp after %s has been published or abandoned.", this);
        this.d.a(j);
    }

    @Override // defpackage.pos
    public final synchronized void j() {
        rnt.O(!this.m, "Cannot create new file after %s has been published or abandoned.", this);
        if (this.n == null) {
            this.l.f(toString().concat("#touch"));
            ppw ppwVarM = m();
            this.n = ppwVarM;
            try {
                ppwVarM.d();
                toString();
                this.n.i().toString();
            } finally {
                this.l.g();
                szh szhVar = this.o;
                ppw ppwVar = this.n;
                ppwVar.getClass();
                szhVar.e(ppwVar.h());
            }
        }
    }

    final synchronized pou k() {
        pot potVar;
        String str;
        pqa pqaVar;
        ppw ppwVar;
        rnt.O(this.m, "Cannot be invoked until %s is published or abandoned.", this);
        potVar = this.d;
        if (potVar.f != 3 || (str = potVar.c) == null || (pqaVar = potVar.d) == null || (ppwVar = potVar.e) == null) {
            throw new IllegalStateException();
        }
        return new pou(potVar.a, potVar.b, str, pqaVar, ppwVar);
    }

    final synchronized ppw l() {
        rnt.O(this.m, "Cannot be invoked until %s is published or abandoned.", this);
        return this.n;
    }

    public final String toString() {
        String strBw;
        Locale locale = Locale.ROOT;
        Integer numValueOf = Integer.valueOf(this.b);
        int i = this.p;
        if (i == 1) {
            strBw = "";
        } else {
            strBw = a.bw(i != 2 ? "CACHE" : "PRIVATE", " (", ")");
        }
        return String.format(locale, "MediaFile-%s%s", numValueOf, strBw);
    }
}
