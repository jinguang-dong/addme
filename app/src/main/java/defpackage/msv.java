package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;
import com.google.googlex.gcam.InterleavedImageU8;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msv extends uht implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msv(huc hucVar, InterleavedImageU8 interleavedImageU8, Rect rect, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = hucVar;
        this.a = interleavedImageU8;
        this.b = rect;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((msv) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((msv) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.d == 0) {
            rnt.aN(obj);
            Object obj2 = this.b;
            ujx ujxVar = (ujx) this.a;
            float fIntBitsToFloat = ujxVar.a + Float.intBitsToFloat((int) (akg.w((bpv) obj2) & 4294967295L));
            ujxVar.a = fIntBitsToFloat;
            bqk bqkVar = (bqk) this.c;
            ujxVar.a = ukc.m(fIntBitsToFloat, -((int) (bqkVar.m() & 4294967295L)), (int) (bqkVar.m() & 4294967295L));
            return ufg.a;
        }
        rnt.aN(obj);
        Object obj3 = this.c;
        huc hucVar = (huc) obj3;
        if (hucVar.v == 1) {
            ((sgt) huc.a.c().M(1579)).s("Live preview update received when live preview not active. Ignoring.");
            return ufg.a;
        }
        InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) this.a;
        hucVar.o = interleavedImageU8;
        Rect rect = new Rect(0, 0, interleavedImageU8.d(), interleavedImageU8.b());
        Object obj4 = this.b;
        Rect rect2 = (Rect) obj4;
        if (rect.contains(rect2)) {
            rect = obj4;
        } else {
            Rect rect3 = new Rect(rect);
            rect3.intersect(rect2);
            ((sgt) huc.a.c().M(1578)).G("Given bounds %s were not in image rect %s. Using valid region %s.", obj4, rect, rect3);
        }
        hucVar.p = rect;
        Bitmap bitmapE = hucVar.w.E(interleavedImageU8);
        bitmapE.getClass();
        ImageView imageView = hucVar.m;
        byte[] bArr = null;
        if (imageView == null) {
            ujp.c("livePreview");
            imageView = null;
        }
        imageView.post(new hdk(obj3, bitmapE, 16, bArr));
        hucVar.h(3);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.d != 0) {
            Object obj2 = this.c;
            return new msv((huc) obj2, (InterleavedImageU8) this.a, (Rect) this.b, uhbVar, 1);
        }
        Object obj3 = this.a;
        return new msv((ujx) obj3, (bpv) this.b, (bqk) this.c, uhbVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msv(ujx ujxVar, bpv bpvVar, bqk bqkVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.a = ujxVar;
        this.b = bpvVar;
        this.c = bqkVar;
    }
}
