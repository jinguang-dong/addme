package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyg implements eqq {
    private final eqq b;

    public eyg(eqq eqqVar) {
        eoz.k(eqqVar);
        this.b = eqqVar;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.eqq
    public final esw b(Context context, esw eswVar, int i, int i2) {
        eyd eydVar = (eyd) eswVar.c();
        esw exgVar = new exg(eydVar.a(), eox.b(context).a, 1);
        eqq eqqVar = this.b;
        esw eswVarB = eqqVar.b(context, exgVar, i, i2);
        if (!exgVar.equals(eswVarB)) {
            exgVar.e();
        }
        eydVar.a.a.d(eqqVar, (Bitmap) eswVarB.c());
        return eswVar;
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof eyg) {
            return this.b.equals(((eyg) obj).b);
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return this.b.hashCode();
    }
}
