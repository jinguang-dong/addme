package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewh implements eqo {
    private final /* synthetic */ int a;
    private final Object b;

    public ewh(int i) {
        this.a = i;
        this.b = new ewf();
    }

    /* JADX WARN: Type inference failed for: r8v18, types: [ete, java.lang.Object] */
    @Override // defpackage.eqo
    public final /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) {
        int i3 = this.a;
        if (i3 == 0) {
            return ((ewf) this.b).a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, eqmVar);
        }
        if (i3 == 1) {
            ewx ewxVar = (ewx) this.b;
            return ewxVar.a(new exe((ByteBuffer) obj, ewxVar.f, ewxVar.g, 1), i, i2, eqmVar, ewx.e);
        }
        if (i3 == 2) {
            return ((ewf) this.b).a(ImageDecoder.createSource(fak.a((InputStream) obj)), i, i2, eqmVar);
        }
        if (i3 != 3) {
            return i3 != 4 ? i3 != 5 ? exg.g(((epu) obj).a(), this.b) : jod.r(ImageDecoder.createSource(fak.a((InputStream) obj)), i, i2, eqmVar) : jod.r(ImageDecoder.createSource((ByteBuffer) obj), i, i2, eqmVar);
        }
        ewx ewxVar2 = (ewx) this.b;
        return ewxVar2.a(new exe((ParcelFileDescriptor) obj, ewxVar2.f, ewxVar2.g, 2), i, i2, eqmVar, ewx.e);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eqo
    public final /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && erj.d();
        }
        if (i == 4) {
            return jod.s(eoy.e(((jod) this.b).a, (ByteBuffer) obj));
        }
        if (i != 5) {
            return true;
        }
        jod jodVar = (jod) this.b;
        return jod.s(eoy.h(jodVar.a, (InputStream) obj, (etl) jodVar.b));
    }

    public ewh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
