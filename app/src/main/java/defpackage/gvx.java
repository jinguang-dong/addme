package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gvx implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v4, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [azr, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) throws Throwable {
        switch (this.b) {
            case 0:
                cbn cbnVar = (cbn) obj;
                cbnVar.getClass();
                cbx.a(cbnVar);
                Object obj2 = this.a;
                if (obj2 != null) {
                    cbw.d(cbnVar, (String) obj2);
                }
                return ufg.a;
            case 1:
                ((chq) obj).getClass();
                return new chy(((chy) this.a.a()).a);
            case 2:
                Float f = (Float) obj;
                f.floatValue();
                this.a.b(f);
                return ufg.a;
            case 3:
                bpv bpvVar = (bpv) obj;
                this.a.a(Float.valueOf(Float.intBitsToFloat((int) (akg.w(bpvVar) >> 32))));
                bpvVar.b();
                return ufg.a;
            case 4:
                irs irsVar = (irs) this.a;
                nlj.j(irsVar.n, irsVar.s, irsVar.c(R.dimen.character_expand_collapse_button_increase_touch_area), irsVar.c(R.dimen.character_expand_collapse_button_increase_touch_area));
                return ufg.a;
            case 5:
                Throwable th = (Throwable) obj;
                Duration duration = iuo.a;
                th.getClass();
                boolean z = th instanceof CancellationException;
                Object obj3 = this.a;
                if (!z && !(th instanceof TimeoutException)) {
                    throw th;
                }
                ((nkw) obj3).name();
                return ezh.H();
            case 6:
                ((jka) this.a).i.h((String) obj);
                return ufg.a;
            case 7:
                ((jkd) this.a).q.h((String) obj);
                return ufg.a;
            case 8:
                return ((Resources) this.a).getString(R.string.brightness_slider_desc, Integer.valueOf((int) (((Float) obj).floatValue() * 100.0f)));
            case 9:
                String str = (String) obj;
                str.getClass();
                ((jkg) this.a).v.h(str);
                return ufg.a;
            case 10:
                String string = ((Resources) this.a).getString(R.string.brightness_slider_desc, Integer.valueOf((int) (((Float) obj).floatValue() * 100.0f)));
                string.getClass();
                return string;
            case 11:
                ((jki) this.a).p.h((String) obj);
                return ufg.a;
            case 12:
                String string2 = ((Resources) this.a).getString(R.string.exposure_slider_desc, Integer.valueOf((int) (((Float) obj).floatValue() * 100.0f)));
                string2.getClass();
                return string2;
            case 13:
                ((jkj) this.a).n.h((String) obj);
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((Resources) this.a).getString(R.string.exposure_slider_desc, Integer.valueOf((int) (((Float) obj).floatValue() * 100.0f)));
            case 15:
                ((jkl) this.a).u.h((String) obj);
                return ufg.a;
            case 16:
                return ((Resources) this.a).getString(R.string.shadow_slider_desc, Integer.valueOf((int) (((Float) obj).floatValue() * 100.0f)));
            case 17:
                ((jkm) this.a).o.h((String) obj);
                return ufg.a;
            case 18:
                ((lit) this.a).x.h((String) obj);
                return ufg.a;
            case 19:
                ((lka) this.a).j.h((String) obj);
                return ufg.a;
            default:
                cbn cbnVar2 = (cbn) obj;
                cbnVar2.getClass();
                Object obj4 = this.a;
                if (obj4 != null) {
                    cbw.d(cbnVar2, (String) obj4);
                }
                return ufg.a;
        }
    }
}
