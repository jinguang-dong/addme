package defpackage;

import android.graphics.drawable.Drawable;
import androidx.preference.Preference;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU8;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class idv implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ idv(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return Long.valueOf(FaceInfoVector.a((FaceInfoVector) obj));
            case 4:
                return Boolean.valueOf(((InterleavedImageU8) obj).i());
            case 5:
                return rwc.j((InterleavedImageU8) obj);
            case 6:
                return Long.valueOf(InterleavedImageU8.e((InterleavedImageU8) obj));
            case 7:
                GrayImageS16 grayImageS16 = (GrayImageS16) obj;
                return Long.valueOf(grayImageS16 == null ? 0L : grayImageS16.a);
            case 8:
                return (iqh) obj;
            case 9:
                return Drawable.createFromPath((String) obj);
            case 10:
                sgv sgvVar = irk.a;
                return ((iqy) ((Map.Entry) obj).getValue()).g;
            case 11:
                return (isj) ((Map.Entry) obj).getKey();
            case 12:
                sgv sgvVar2 = irk.a;
                efh efhVar = (efh) ske.V((Future) ((Map.Entry) obj).getValue());
                efhVar.getClass();
                return efhVar;
            case 13:
                sgv sgvVar3 = irk.a;
                return ((iqy) ((Map.Entry) obj).getValue()).f;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((lau) obj).a;
            case 15:
                int i = jde.c;
                return true;
            case 16:
                return ((CharSequence) obj).toString();
            case 17:
                ((Preference) obj).getClass();
                return true;
            case 18:
                return ((jjq) obj).e;
            case 19:
                return ((jjq) obj).a;
            default:
                return ((jjq) obj).f;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
