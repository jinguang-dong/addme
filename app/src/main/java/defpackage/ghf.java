package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ghf implements syf {
    final /* synthetic */ szh a;
    final /* synthetic */ pka b;
    final /* synthetic */ lte c;
    final /* synthetic */ ghg d;

    public ghf(ghg ghgVar, szh szhVar, pka pkaVar, lte lteVar) {
        this.a = szhVar;
        this.b = pkaVar;
        this.c = lteVar;
        this.d = ghgVar;
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            szh szhVar = this.a;
            ghg ghgVar = this.d;
            ghh ghhVar = ghgVar.b;
            pao paoVar = pao.CLOCKWISE_0;
            pka pkaVar = this.b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            gbu gbuVarA = ghhVar.a(byteArrayOutputStream.toByteArray(), paoVar, pkaVar);
            gbuVarA.g = new pas(bitmap.getWidth(), bitmap.getHeight());
            gbuVarA.c(1);
            gbuVarA.b(System.currentTimeMillis() - ghgVar.c);
            gbuVarA.j = this.c;
            szhVar.e(gbuVarA.a());
        } catch (Exception e) {
            this.a.a(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        ((sgt) ((sgt) ghg.a.b().i(th)).M((char) 895)).s(LmJPKwPBa.RXlt);
        this.a.a(th);
    }
}
