package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erf implements eqw {
    private final etl a;

    public erf(etl etlVar) {
        this.a = etlVar;
    }

    @Override // defpackage.eqw
    public final /* bridge */ /* synthetic */ eqx a(Object obj) {
        return new erg((InputStream) obj, this.a);
    }

    @Override // defpackage.eqw
    public final Class b() {
        return InputStream.class;
    }
}
