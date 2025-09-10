package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.portrait.preview.NativePortraitPreviewProcessor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lap implements tzt {
    private final /* synthetic */ int a;

    public lap(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return rvk.a;
            case 1:
                return new ovx(laj.a);
            case 2:
                return new ovx(-1);
            case 3:
                return new qqq(null);
            case 4:
                return new ovx(Float.valueOf(0.0f));
            case 5:
                return new qpt(bArr);
            case 6:
                CaptureRequest.Key key = nvh.a;
                Object sfmVar = key != null ? new sfm(new pej(key, 0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 7:
                return new qpt(bArr);
            case 8:
                lem lemVar = lem.NORMAL;
                lemVar.getClass();
                lemVar.getClass();
                return new ovx(new len(lemVar, lemVar));
            case 9:
                lkt lktVar = new lkt();
                lktVar.f(true);
                lktVar.e(0L);
                return new ovx(lktVar.d());
            case 10:
                lek lekVar = new lek();
                lekVar.c(true);
                lekVar.b(0.0f);
                return new ovx(lekVar.a());
            case 11:
                leo leoVar = new leo();
                leoVar.b(true);
                leoVar.c(0);
                return new ovx(leoVar.a());
            case 12:
                return new pfl((char[]) null);
            case 13:
                return new ouy(ojl.bZ("PortraitProc"));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.N();
            case 15:
                return new NativePortraitPreviewProcessor();
            case 16:
                return new ouy(ojl.bW("MilkExecutor"));
            case 17:
                qtj qtjVarD = qtk.d();
                qtjVarD.d = true == ual.a.fr().c() ? 3 : 2;
                return qtjVarD.a();
            case 18:
                qpr qprVarD = qps.d();
                qprVarD.b(ual.a.fr().a());
                return qprVarD.a();
            case 19:
                return true;
            default:
                quq quqVarD = qur.d();
                quqVarD.c = true == ual.a.fr().d() ? 3 : 2;
                int i = sbp.d;
                quqVarD.a = rwc.j(new quo(3, 5, sex.a));
                return quqVarD.a();
        }
    }
}
