package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.hdrplus.fusion.deblur.jni.NativeDeblurFusion;
import com.google.android.apps.camera.hdrplus.fusion.deblur.jni.NativeFaceToPortraitSegmenter;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifd implements tzt {
    private final /* synthetic */ int a;

    public ifd(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new NativeFaceToPortraitSegmenter();
            case 1:
                return new NativeDeblurFusion();
            case 2:
                return a.O();
            case 3:
                return new tdi();
            case 4:
                return a.P();
            case 5:
                return a.P();
            case 6:
                return a.N();
            case 7:
                return new szh();
            case 8:
                return new pej(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1);
            case 9:
                CaptureRequest.Key key = nvm.k;
                Object sfmVar = key != null ? new sfm(new pej(key, true)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 10:
                CaptureRequest.Key key2 = nvn.h;
                Object sfmVar2 = key2 != null ? new sfm(new pej(key2, false)) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 11:
                return new ovx(ick.a());
            case 12:
                File file = iht.a;
                File file2 = iht.a;
                return new ihx(new File(file2, "geometry_descriptor/segment_size"), new File(file2, "geometry_descriptor/allocation_unit_size"), new File(file2, "attributes/wb_cur_buf"), new File(file2, "attributes/wb_avail_buf"), new File(file2, "attributes/wb_life_time_est"));
            case 13:
                return new ggg((byte[]) null, (byte[]) null);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Set setSynchronizedSet = DesugarCollections.synchronizedSet(new HashSet());
                setSynchronizedSet.getClass();
                return setSynchronizedSet;
            case 15:
                return iso.b();
            case 16:
                return new inv();
            case 17:
                return a.O();
            case 18:
                return a.O();
            case 19:
                return a.O();
            default:
                return new ovx(dtp.b);
        }
    }
}
