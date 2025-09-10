package defpackage;

import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hca implements fqb {
    private static final sgv d = sgv.g("hca");
    protected final hcb a;
    public fqc b;
    protected jls c;
    private final ltg e;

    static {
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.systemDefault());
    }

    protected hca(hcb hcbVar, fqc fqcVar, ltg ltgVar) {
        hcbVar.getClass();
        this.a = hcbVar;
        fqcVar.getClass();
        this.b = fqcVar;
        this.e = ltgVar;
        this.c = jls.a;
    }

    protected static final eqi i(fqc fqcVar) {
        fqcVar.i();
        return new fah(fqcVar.i(), fqcVar.h().getEpochSecond(), fqcVar.a());
    }

    @Override // defpackage.fqb
    public final fqc a() {
        return this.b;
    }

    @Override // defpackage.fqb
    public final jls c() {
        return this.c;
    }

    @Override // defpackage.fqb
    public final ltg d() {
        return this.e;
    }

    @Override // defpackage.fqb
    public final void e(fqc fqcVar) {
        this.b = fqcVar;
    }

    @Override // defpackage.fqb
    public final void f(jls jlsVar) {
        this.c = jlsVar;
    }

    @Override // defpackage.fqb
    public final void g(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            ((sgt) d.c().M(1147)).s("Suggested size was set to a zero area value!");
        }
    }
}
