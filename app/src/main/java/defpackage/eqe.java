package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqe implements eqh {
    final /* synthetic */ erj a;
    final /* synthetic */ etl b;

    public eqe(erj erjVar, etl etlVar) {
        this.a = erjVar;
        this.b = etlVar;
    }

    @Override // defpackage.eqh
    public final ImageHeaderParser$ImageType a(eqc eqcVar) throws Throwable {
        exi exiVar;
        try {
            exiVar = new exi(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
            exiVar = null;
        }
        try {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = eqcVar.a(exiVar);
            exiVar.b();
            this.a.a();
            return imageHeaderParser$ImageTypeA;
        } catch (Throwable th2) {
            th = th2;
            if (exiVar != null) {
                exiVar.b();
            }
            this.a.a();
            throw th;
        }
    }
}
