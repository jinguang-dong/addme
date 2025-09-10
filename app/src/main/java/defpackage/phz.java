package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phz implements pio {
    private static final paq a = new pan(0);
    private final peo b;
    private final piq c;
    private pdo d = null;

    public phz(peo peoVar, piq piqVar) {
        this.b = peoVar;
        this.c = piqVar;
    }

    public static pio e(peo peoVar, piq piqVar) {
        piqVar.getClass();
        return new phz(peoVar, piqVar);
    }

    public static pio f(peo peoVar) {
        return (!(peoVar instanceof pil) || ((pil) peoVar).g() <= 0) ? g(peoVar) : new phz(peoVar, piq.g());
    }

    public static pio g(peo peoVar) {
        boolean z = true;
        if ((peoVar instanceof pil) && ((pil) peoVar).g() > 0) {
            z = false;
        }
        rnt.B(z, "Cannot create a streamResult from a stream that uses more than 0 bytesPerImage");
        return new phz(peoVar, null);
    }

    @Override // defpackage.pio
    public final paq a() {
        piq piqVar = this.c;
        return piqVar != null ? piqVar.a() : a;
    }

    @Override // defpackage.pio
    public final paq b() {
        piq piqVar = this.c;
        return piqVar != null ? piqVar.b() : a;
    }

    @Override // defpackage.pio
    public final synchronized pdo c() {
        return this.d;
    }

    @Override // defpackage.pio
    public final peo d() {
        return this.b;
    }

    @Override // defpackage.pio
    public final synchronized List h() {
        int i = sbp.d;
        return sex.a;
    }

    @Override // defpackage.pio
    public final synchronized void i(per perVar) {
        if (perVar != null) {
            poj pojVar = perVar.b;
            if (pojVar != null) {
                pojVar.close();
                throw new IllegalStateException("External results must never receive StreamOutputImage(s)");
            }
        }
    }

    @Override // defpackage.pio
    public final synchronized void j(pdo pdoVar) {
        this.d = pdoVar;
    }

    @Override // defpackage.pio
    public final synchronized void k(pgf pgfVar) {
        pgfVar.i();
    }

    public final synchronized String toString() {
        Long lValueOf;
        pdo pdoVar = this.d;
        lValueOf = pdoVar == null ? null : Long.valueOf(pdoVar.c);
        Objects.toString(lValueOf);
        return "ExternalStreamResult-".concat(String.valueOf(lValueOf));
    }
}
