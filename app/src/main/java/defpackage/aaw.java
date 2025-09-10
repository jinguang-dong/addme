package defpackage;

import android.content.res.Resources;
import android.os.CancellationSignal;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaw extends ujq implements uiq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaw(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Comparable, java.lang.Object] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                btd.q((btd) obj, (bte) this.a, 0, 0);
                return ufg.a;
            case 1:
                acd acdVar = (acd) obj;
                float f = acdVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f2 = acdVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f3 = acdVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = acdVar.a;
                float f6 = f5 >= 0.0f ? f5 : 0.0f;
                float[] fArr = bmb.a;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                return new bkv(bkv.e(bko.k(f, f2, f4, f6, bmb.x), (blz) this.a));
            case 2:
                btd.q((btd) obj, (bte) this.a, 0, 0);
                return ufg.a;
            case 3:
                bjg bjgVar = (bjg) obj;
                if (!bjgVar.w) {
                    return bxc.b;
                }
                bjg bjgVar2 = bjgVar.d;
                uiq uiqVar = bjgVar.a;
                bjgVar.d = null;
                bjg bjgVar3 = bjgVar.d;
                return bxc.a;
            case 4:
                blm blmVar = (blm) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.a;
                blmVar.u(chp.O(blmVar, shadowGraphicsLayerElement.a));
                blmVar.v(shadowGraphicsLayerElement.b);
                blmVar.p(false);
                blmVar.m(shadowGraphicsLayerElement.e);
                blmVar.w(shadowGraphicsLayerElement.f);
                return ufg.a;
            case 5:
                bxd bxdVar = (bxd) obj;
                if (bxdVar.B().w) {
                    ((uka) this.a).a = bxdVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                bpl bplVar = (bpl) obj;
                uka ukaVar = (uka) this.a;
                if (ukaVar.a == null && bplVar.b) {
                    ukaVar.a = bplVar;
                }
                return true;
            case 7:
                if (!((bpl) obj).b) {
                    return bxc.a;
                }
                ((ujw) this.a).a = false;
                return bxc.c;
            case 8:
                Throwable th = (Throwable) obj;
                bqk bqkVar = (bqk) this.a;
                umk umkVar = bqkVar.a;
                if (umkVar != null) {
                    umkVar.g(th);
                }
                bqkVar.a = null;
                return ufg.a;
            case 9:
                btd btdVar = (btd) obj;
                ?? r6 = this.a;
                int size = r6.size();
                for (int i = 0; i < size; i++) {
                    btd.t(btdVar, (bte) r6.get(i), 0, 0);
                }
                return ufg.a;
            case 10:
                bug bugVar = (bug) obj;
                if (bugVar.o()) {
                    if (bugVar.h().b) {
                        bugVar.l();
                    }
                    Map map = bugVar.h().h;
                    Object obj2 = this.a;
                    for (Map.Entry entry : map.entrySet()) {
                        ((buf) obj2).d((bqv) entry.getKey(), ((Number) entry.getValue()).intValue(), bugVar.j());
                    }
                    bwi bwiVar = bugVar.j().w;
                    bwiVar.getClass();
                    while (true) {
                        buf bufVar = (buf) obj2;
                        if (!a.ao(bwiVar, bufVar.a.j())) {
                            for (bqv bqvVar : bufVar.c(bwiVar).keySet()) {
                                bufVar.d(bqvVar, bufVar.a(bwiVar, bqvVar), bwiVar);
                            }
                            bwiVar = bwiVar.w;
                            bwiVar.getClass();
                        }
                    }
                }
                return ufg.a;
            case 11:
                ((bdp) this.a).n((bii) obj);
                return true;
            case 12:
                ((uka) this.a).a = (bkb) obj;
                return true;
            case 13:
                return Boolean.valueOf(((bkb) obj).e(((bjm) this.a).a));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(((bkb) obj).e(((bjm) this.a).a));
            case 15:
                return Boolean.valueOf(((yq) this.a).b(((cbr) obj).e));
            case 16:
                return Boolean.valueOf(bad.x((cbr) obj, (Resources) this.a));
            case 17:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.a).cancel();
                }
                return ufg.a;
            case 18:
                cbw.g((cbn) obj, ((cbk) this.a).a);
                return ufg.a;
            case 19:
                cbw.d((cbn) obj, (String) this.a);
                return ufg.a;
            default:
                return Integer.valueOf(ske.aK((Float) ((uev) obj).a, this.a));
        }
    }
}
