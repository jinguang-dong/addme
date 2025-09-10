package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyl implements eyn {
    private final /* synthetic */ int a;
    private final Object b;

    public eyl(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.eyn
    public final esw a(esw eswVar, eqm eqmVar) {
        if (this.a == 0) {
            return exg.f((Resources) this.b, eswVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) eswVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
        eswVar.e();
        return new exv(byteArrayOutputStream.toByteArray(), 0);
    }

    public eyl(Resources resources, int i) {
        this.a = i;
        eoz.k(resources);
        this.b = resources;
    }
}
