package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pig implements pio, paq {
    private final peo a;
    private final piq c;
    private pdo d = null;
    private per e = null;
    private boolean f = false;
    private boolean g = false;
    private final List b = new ArrayList();

    public pig(peo peoVar, piq piqVar) {
        this.a = peoVar;
        this.c = piqVar;
    }

    public static pio e(peo peoVar, piq piqVar) {
        piqVar.getClass();
        pig pigVar = new pig(peoVar, piqVar);
        piqVar.e(pigVar);
        return pigVar;
    }

    private final synchronized void f() {
        if (!this.g) {
            this.g = true;
            List list = this.b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((pgf) it.next()).i();
                }
                list.clear();
            }
        }
    }

    @Override // defpackage.pio
    public final paq a() {
        return this.c.a();
    }

    @Override // defpackage.pio
    public final paq b() {
        return this.c.b();
    }

    @Override // defpackage.pio
    public final synchronized pdo c() {
        return this.d;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        f();
        this.e = null;
    }

    @Override // defpackage.pio
    public final peo d() {
        return this.a;
    }

    @Override // defpackage.pio
    public final synchronized List h() {
        paq paqVarB;
        per perVar = this.e;
        if (perVar == null) {
            int i = sbp.d;
            return sex.a;
        }
        piq piqVar = this.c;
        poj pojVar = perVar.b;
        pir pirVar = null;
        if (pojVar != null && (paqVarB = piqVar.b()) != null) {
            pirVar = new pir(pojVar, paqVarB);
        }
        return sbp.l(new per(perVar.a, pirVar));
    }

    @Override // defpackage.pio
    public final synchronized void i(per perVar) {
        per perVar2;
        poj pojVar = perVar == null ? null : perVar.b;
        rnt.s(pojVar == null || this.d != null);
        if (this.f) {
            rnt.v(pojVar == null || (perVar2 = this.e) == null || perVar2.b == null, uCzt.dScjKVbHH, this.d, this.a);
            return;
        }
        this.f = true;
        if (pojVar != null) {
            this.d.getClass();
            piq piqVar = this.c;
            piqVar.e(pojVar);
            if (!piqVar.d()) {
                this.e = perVar;
            }
        } else {
            piq piqVar2 = this.c;
            synchronized (piqVar2) {
                piqVar2.c = true;
            }
            piqVar2.d.close();
        }
        f();
    }

    @Override // defpackage.pio
    public final synchronized void j(pdo pdoVar) {
        rnt.v(!this.f, "An image was already set for frame %s on %s!", pdoVar, this.a);
        this.d = pdoVar;
    }

    @Override // defpackage.pio
    public final synchronized void k(pgf pgfVar) {
        if (this.g) {
            pgfVar.i();
        } else {
            this.b.add(pgfVar);
        }
    }

    public final synchronized String toString() {
        Long lValueOf;
        pdo pdoVar = this.d;
        lValueOf = pdoVar == null ? null : Long.valueOf(pdoVar.c);
        Objects.toString(lValueOf);
        return "ImageStreamResult-".concat(String.valueOf(lValueOf));
    }
}
