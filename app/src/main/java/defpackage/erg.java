package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erg implements eqx {
    public final exi a;

    public erg(InputStream inputStream, etl etlVar) {
        exi exiVar = new exi(inputStream, etlVar);
        this.a = exiVar;
        exiVar.mark(5242880);
    }

    @Override // defpackage.eqx
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.eqx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        exi exiVar = this.a;
        exiVar.reset();
        return exiVar;
    }
}
