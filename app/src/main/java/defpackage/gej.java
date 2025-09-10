package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Size;
import com.google.android.apps.camera.ui.modeslider.ModeSliderUi;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlRequest;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gej implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gej(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        ltt lttVar;
        switch (this.b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                synchronized (((gem) obj2).e) {
                    if (((gem) obj2).h) {
                        return;
                    }
                    if (zBooleanValue) {
                        ((gem) obj2).a(((gem) obj2).f.d(lth.EXT_BLUETOOTH));
                    } else {
                        ((gem) obj2).b();
                    }
                    return;
                }
            case 1:
                int i = true != ((Boolean) obj).booleanValue() ? 0 : 2;
                pey peyVar = (pey) pfu.v();
                peyVar.g = Integer.valueOf(i);
                ((pfu) this.a).r(new pex(peyVar));
                return;
            case 2:
                Object obj3 = this.a;
                synchronized (((gem) obj3).e) {
                    if (((gem) obj3).h) {
                        return;
                    }
                    lti ltiVar = ((gem) obj3).f;
                    lth lthVar = lth.EXT_BLUETOOTH;
                    String strD = ltiVar.d(lthVar);
                    if (((gem) obj3).g && ((ltu) ltiVar.a.dL()).equals(ltu.EXT_BLUETOOTH) && !strD.isEmpty()) {
                        ((gem) obj3).a(strD);
                    }
                    gzi gziVar = gym.a;
                    if (((gem) obj3).g && ((ltu) ltiVar.a.dL()).equals(ltu.EXT_BLUETOOTH) && strD.isEmpty()) {
                        ((gem) obj3).j = 3;
                        ltiVar.f(lthVar, false);
                        ((gem) obj3).k = 1;
                    }
                    return;
                }
            case 3:
                Long l = (Long) obj;
                Object obj4 = this.a;
                gff gffVar = (gff) obj4;
                if (gffVar.f) {
                    gffVar.f = false;
                    return;
                }
                AtomicLong atomicLong = gffVar.c;
                if (!atomicLong.compareAndSet(-1L, l.longValue()) || gffVar.e) {
                    return;
                }
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/p11-global-meta");
                oyj oyjVar = gffVar.b;
                rwc rwcVarB = oyjVar.b(mediaFormat);
                if (rwcVarB.h()) {
                    try {
                        P11MetadataSerializer p11MetadataSerializer = ((gff) obj4).d;
                        vdu vduVar = ((gff) obj4).h;
                        CameraCharacteristics.Key key = nvp.s;
                        byte[] bArr = key == null ? new byte[0] : (byte[]) Objects.requireNonNullElse((byte[]) p11MetadataSerializer.c.m(key), new byte[0]);
                        CameraCharacteristics.Key key2 = nvp.x;
                        float[] fArr = key2 == null ? new float[0] : (float[]) Objects.requireNonNullElse((float[]) p11MetadataSerializer.c.m(key2), new float[0]);
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        Size size = vduVar.d;
                        ByteBuffer byteBufferNativeSerializeGlobalMetadata = P11MetadataSerializer.nativeSerializeGlobalMetadata(size.getWidth(), size.getHeight(), vduVar.a, vduVar.b, vduVar.c, vduVar.e, bArr, fArr, p11MetadataSerializer.a.a);
                        String.format(Locale.US, "serializeGlobalMetadata took %.2f ms", Float.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0f));
                        if (byteBufferNativeSerializeGlobalMetadata == null) {
                            throw new vdt("serializeGlobalMetadata failed");
                        }
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        bufferInfo.size = byteBufferNativeSerializeGlobalMetadata.remaining();
                        bufferInfo.offset = 0;
                        bufferInfo.presentationTimeUs = atomicLong.get();
                        oyjVar.n(byteBufferNativeSerializeGlobalMetadata, bufferInfo, ((Integer) rwcVarB.c()).intValue());
                        ((gff) obj4).g++;
                        ((gff) obj4).e = true;
                        return;
                    } catch (vdt e) {
                        ((sgt) ((sgt) gff.a.c().i(e)).M(859)).r(e);
                        return;
                    }
                }
                return;
            case 4:
                Long l2 = (Long) obj;
                gfj gfjVar = (gfj) this.a;
                if (gfjVar.b) {
                    gfjVar.b = false;
                    return;
                } else {
                    gfjVar.a.compareAndSet(-1L, l2.longValue());
                    return;
                }
            case 5:
                gho ghoVar = (gho) obj;
                ghr ghrVar = (ghr) this.a;
                gho ghoVar2 = ghrVar.f;
                boolean z = ghrVar.g;
                if (ghoVar2 != ghoVar) {
                    rwc rwcVar = ghrVar.b;
                    if (rwcVar.h()) {
                        ((gmt) rwcVar.c()).b(ghoVar);
                    }
                    Iterator it = ghrVar.a.iterator();
                    while (it.hasNext()) {
                        ((ghq) it.next()).a(ghoVar2, ghoVar, z);
                    }
                    ghrVar.f = ghoVar;
                }
                ghrVar.g = true;
                return;
            case 6:
                ((Boolean) obj).booleanValue();
                ((gks) this.a).d();
                return;
            case 7:
                ((krj) this.a).m(false, krs.AMETHYST);
                return;
            case 8:
                ((krj) this.a).m(false, krs.AMETHYST);
                return;
            case 9:
                ((krj) this.a).m(false, krs.AMETHYST);
                return;
            case 10:
                ksa ksaVar = (ksa) obj;
                glf glfVarG = ((gld) this.a).g();
                if (((ksa) glfVarG.dL()).equals(ksaVar)) {
                    return;
                }
                glfVarG.a(ksaVar);
                return;
            case 11:
                ((gld) this.a).m();
                return;
            case 12:
                ((krj) this.a).m(false, krs.AMETHYST);
                return;
            case 13:
                nkw nkwVar = (nkw) obj;
                Object obj5 = this.a;
                gli gliVar = (gli) obj5;
                if (gliVar.k(nkwVar)) {
                    if (gliVar.l(nkwVar)) {
                        gliVar.i(nkwVar);
                        return;
                    }
                    return;
                } else {
                    synchronized (gliVar.h) {
                        ((gli) obj5).j = nkwVar;
                        Iterator it2 = ((gli) obj5).c.iterator();
                        while (it2.hasNext()) {
                            ((glj) it2.next()).a();
                        }
                    }
                    gliVar.f(false);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (((juk) obj).c) {
                    gli gliVar2 = (gli) this.a;
                    if (gliVar2.m.b.containsKey(gliVar2.a.dL())) {
                        gliVar2.e();
                        gliVar2.g(true);
                        gliVar2.l.e(true);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                List list = (List) obj;
                gli gliVar3 = (gli) this.a;
                ModeSliderUi modeSliderUi = gliVar3.k;
                if (modeSliderUi == null || modeSliderUi.getVisibility() != 0) {
                    return;
                }
                gliVar3.j(((goi) list.get(0)).a(), ((Boolean) list.get(1)).booleanValue());
                return;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    ((glt) this.a).a();
                    return;
                }
                return;
            case 17:
                ((glu) this.a).t();
                return;
            case 18:
                ksa ksaVar2 = (ksa) obj;
                glu gluVar = (glu) this.a;
                if (ksaVar2.equals(gluVar.g())) {
                    return;
                }
                owq owqVarQ = gluVar.q();
                switch (ksaVar2.ordinal()) {
                    case 27:
                        lttVar = ltt.FPS_AUTO;
                        break;
                    case 28:
                        lttVar = ltt.FPS_24;
                        break;
                    case 29:
                        lttVar = ltt.FPS_30;
                        break;
                    case 30:
                        lttVar = ltt.FPS_60;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid menu option: ".concat(String.valueOf(String.valueOf(ksaVar2))));
                }
                owqVarQ.a(lttVar);
                return;
            case 19:
                ((glu) this.a).t();
                return;
            default:
                ((krj) this.a).m(false, krs.BACK_VIDEO_FLASH);
                return;
        }
    }
}
