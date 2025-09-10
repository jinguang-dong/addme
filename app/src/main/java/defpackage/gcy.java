package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.ar.core.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gcy implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gcy(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) throws Resources.NotFoundException {
        int i = this.c;
        if (i == 0) {
            Integer num = (Integer) obj;
            if (num.intValue() <= 0 || this.a < num.intValue()) {
                return;
            }
            ((gcz) this.b).g.b();
            return;
        }
        int i2 = 1;
        if (i == 1) {
            if (this.a >= ((Integer) obj).intValue()) {
                gcz gczVar = (gcz) this.b;
                float fFloatValue = ((Float) gczVar.d.b.dL()).floatValue();
                String strConcat = "Successive Frame Drops Trigger: ".concat(ezh.C(gczVar.c, gczVar.e, fFloatValue));
                pbn pbnVar = gczVar.f;
                pbnVar.f(strConcat);
                pbnVar.g();
                if (gczVar.h) {
                    return;
                }
                cxb.I();
                gczVar.h = true;
                return;
            }
            return;
        }
        iyu iyuVar = (iyu) obj;
        out.a();
        uem uemVar = iyuVar.i;
        moc mocVar = (moc) uemVar.a();
        String strR = iyuVar.l.r();
        if (strR == null) {
            nkw nkwVar = nkw.UNINITIALIZED;
            switch (iyuVar.p.ordinal()) {
                case 1:
                case 3:
                case 4:
                case 6:
                case 7:
                case 9:
                case 17:
                case 18:
                    strR = iyuVar.g.getString(R.string.photo_accessibility_peek);
                    break;
                case 2:
                case 5:
                case 8:
                case 11:
                case 13:
                case 19:
                    strR = iyuVar.g.getString(R.string.video_accessibility_peek);
                    break;
                case 10:
                case 12:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 15:
                case 16:
                default:
                    strR = iyuVar.g.getString(R.string.media_accessibility_peek);
                    break;
            }
        }
        int i3 = this.a;
        Object obj2 = this.b;
        mocVar.i(strR);
        pbn pbnVar2 = iyuVar.h;
        pbnVar2.f("updateCaptureIndicatorThumbnail");
        Bitmap bitmap = (Bitmap) obj2;
        ((moc) uemVar.a()).k(bitmap, i3);
        pbnVar2.g();
        iyuVar.l.s(new mvm(iyuVar, bitmap, i3, i2));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.c;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
