package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.vr.audio.Cf.qcjAcSmlN;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnk extends ujq implements uif {
    private final /* synthetic */ int v;
    public static final bnk u = new bnk(20);
    public static final bnk t = new bnk(19);
    public static final bnk s = new bnk(18);
    public static final bnk r = new bnk(17);
    public static final bnk q = new bnk(16);
    public static final bnk p = new bnk(15);
    public static final bnk o = new bnk(14);
    public static final bnk n = new bnk(13);
    public static final bnk m = new bnk(12);
    public static final bnk l = new bnk(11);
    public static final bnk k = new bnk(10);
    public static final bnk j = new bnk(9);
    public static final bnk i = new bnk(8);
    public static final bnk h = new bnk(7);
    public static final bnk g = new bnk(6);
    public static final bnk f = new bnk(5);
    public static final bnk e = new bnk(4);
    public static final bnk d = new bnk(3);
    public static final bnk c = new bnk(2);
    public static final bnk b = new bnk(1);
    public static final bnk a = new bnk(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnk(int i2) {
        super(0);
        this.v = i2;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        Choreographer choreographer;
        boolean z = false;
        byte[] bArr = null;
        switch (this.v) {
            case 0:
                return new ejs(new PathMeasure(), (byte[]) null);
            case 1:
                return true;
            case 2:
                return ufg.a;
            case 3:
                return null;
            case 4:
                return new bvm(z, 3, bArr);
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw new uer();
            case 6:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw new uer();
            case 7:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw new uer();
            case 8:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw new uer();
            case 9:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw new uer();
            case 10:
                if (byx.b()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    una unaVar = unr.a;
                    choreographer = (Choreographer) ukc.z(uvw.a, new byo(null, 0));
                }
                byr byrVar = new byr(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return byrVar.plus(byrVar.j);
            case 11:
            case 12:
                return null;
            case 13:
                bze.a("LocalAutofillManager");
                throw new uer();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bze.a("LocalAutofillTree");
                throw new uer();
            case 15:
                bze.a("LocalClipboard");
                throw new uer();
            case 16:
                bze.a("LocalClipboardManager");
                throw new uer();
            case 17:
                bze.a("LocalDensity");
                throw new uer();
            case 18:
                bze.a("LocalFocusManager");
                throw new uer();
            case 19:
                bze.a("LocalFontFamilyResolver");
                throw new uer();
            default:
                bze.a(qcjAcSmlN.gyTwsVegVqykhQ);
                throw new uer();
        }
    }
}
