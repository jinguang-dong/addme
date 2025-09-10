package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdk implements puq {
    public final rwc a;
    private final Executor b;
    private final qat c;

    public qdk(qdj qdjVar) {
        this.b = qdjVar.a;
        this.c = qdjVar.d;
        this.a = qdjVar.c;
    }

    @Override // defpackage.puq
    public final syu a(pvu pvuVar) {
        int i = qbu.a;
        return qdp.e(qsz.k(this.c.d(Uri.parse("asset:/centaur_manifest_config_default_variant.pb")), Throwable.class, new kjl(puk.MANIFEST_FILE_GROUP_POPULATOR_PARSE_MANIFEST_FILE_ERROR, 9), sxo.a)).g(new pzn(this, pvuVar, 15, null), this.b);
    }
}
