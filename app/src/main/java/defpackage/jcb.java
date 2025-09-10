package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaFormat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.ar.core.R;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcb implements syf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jcb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((sgt) ((sgt) jcc.a.b().i(th)).M((char) 2648)).s("Failed to get screenshot.");
                break;
            case 1:
            case 12:
            case 13:
                break;
            case 2:
                if (!(th instanceof CancellationException)) {
                    sgt sgtVar = (sgt) ((sgt) jov.a.c().i(th)).M(2980);
                    jou jouVar = (jou) this.a;
                    sgtVar.C("%s: track id %d failed", jouVar.b.b, jouVar.a);
                    break;
                }
                break;
            case 3:
                ((kjn) this.a).d.a.e("Jpeg encoding result failed, not updating remote thumbnail.", th);
                break;
            case 4:
                ((kjn) this.a).d.a.e("Failed to save image!", th);
                break;
            case 5:
                ((kjn) this.a).d.a.e("Failed to generate thumbnail", th);
                break;
            case 6:
                ((kjn) this.a).d.a.e("Failed to generate thumbnail", th);
                break;
            case 7:
                ((kjn) this.a).d.a.e("Failed to generate thumbnails", th);
                break;
            case 8:
                ((kwn) this.a).a = 0;
                break;
            case 9:
                ((lrl) this.a).al();
                break;
            case 10:
                ((lrw) this.a).b.x();
                break;
            case 11:
                ((lrw) this.a).b.x();
                break;
            default:
                ((myl) this.a).d();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, syu] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((jcc) this.a).b(bitmap, true);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.a;
                gdv gdvVar = (gdv) obj;
                synchronized (((fyc) obj2).d) {
                    ((fyc) obj2).c = gdvVar;
                }
                return;
            case 2:
                MediaFormat mediaFormat = (MediaFormat) obj;
                mediaFormat.getClass();
                String.format(Locale.US, "id: %d %s resolution: %s", Integer.valueOf(((jou) this.a).a), mediaFormat.getString("mime"), (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) ? String.format(Locale.US, "%d x %d", Integer.valueOf(mediaFormat.getInteger("width")), Integer.valueOf(mediaFormat.getInteger("height"))) : "N/A");
                return;
            case 3:
                Object obj3 = this.a;
                kjo kjoVar = ((kjn) obj3).d;
                kjd kjdVar = (kjd) obj;
                synchronized (kjoVar.d) {
                    int i3 = kjoVar.g;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 3) {
                        return;
                    }
                    kjdVar.getClass();
                    byte[] bArr = kjdVar.b;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    lss lssVar = ((kjn) obj3).a;
                    bitmapDecodeByteArray.getClass();
                    lssVar.ae(bitmapDecodeByteArray, pcu.a(pcu.c(kjdVar.c)).e);
                    kjoVar.g = 2;
                    return;
                }
            case 4:
                Object obj4 = this.a;
                kjo kjoVar2 = ((kjn) obj4).d;
                kjd kjdVar2 = (kjd) obj;
                synchronized (kjoVar2.d) {
                    kjdVar2.getClass();
                    kjoVar2.g = 2;
                    pbc pbcVar = kjoVar2.a;
                    pbcVar.g("Setting final result");
                    ocq ocqVar = kjoVar2.h;
                    ExifInterface exifInterface = kjdVar2.c;
                    ocqVar.q(exifInterface);
                    mfo mfoVar = new mfo(ppo.c);
                    mfoVar.a(exifInterface);
                    ((kjn) obj4).a.u(kjdVar2.b, mfoVar);
                    pbcVar.g("Done saving image");
                }
                return;
            case 5:
                Object obj5 = this.a;
                kjo kjoVar3 = ((kjn) obj5).d;
                Bitmap bitmap2 = (Bitmap) obj;
                synchronized (kjoVar3.d) {
                    int i4 = kjoVar3.g;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i4 == 4) {
                        return;
                    }
                    kjoVar3.g = 3;
                    lss lssVar2 = ((kjn) obj5).a;
                    ocq ocqVar2 = ((kjn) obj5).e;
                    bitmap2.getClass();
                    lssVar2.af(ocqVar2.ao(bitmap2, 0, lssVar2.ah()));
                    return;
                }
            case 6:
                Object obj6 = this.a;
                kjo kjoVar4 = ((kjn) obj6).d;
                Bitmap bitmap3 = (Bitmap) obj;
                synchronized (kjoVar4.d) {
                    int i5 = kjoVar4.g;
                    if (i5 == 0) {
                        throw null;
                    }
                    if (i5 == 4) {
                        return;
                    }
                    kjoVar4.g = 3;
                    lss lssVar3 = ((kjn) obj6).a;
                    if (!lssVar3.ah()) {
                        pao paoVar = ((kjn) obj6).c;
                        paoVar.getClass();
                        i2 = paoVar.e;
                    }
                    ocq ocqVar3 = ((kjn) obj6).e;
                    bitmap3.getClass();
                    pao paoVar2 = ((kjn) obj6).c;
                    paoVar2.getClass();
                    lssVar3.ae(ocqVar3.ao(bitmap3, paoVar2.e, lssVar3.ah()), i2);
                    return;
                }
            case 7:
                obu obuVar = (obu) obj;
                obuVar.getClass();
                Object obj7 = this.a;
                jcb jcbVar = new jcb(obj7, 5);
                ?? r1 = obuVar.a;
                sxo sxoVar = sxo.a;
                ske.W(r1, jcbVar, sxoVar);
                ske.W(obuVar.b, new jcb(obj7, 6), sxoVar);
                return;
            case 8:
                ((kwn) this.a).a = 0;
                return;
            case 9:
                boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
                lrl lrlVar = (lrl) this.a;
                if (zEquals) {
                    lrlVar.m = true;
                    return;
                } else {
                    lrlVar.al();
                    return;
                }
            case 10:
                ((lsc) this.a).P();
                return;
            case 11:
                lrw lrwVar = (lrw) this.a;
                lrwVar.K();
                lrwVar.r().g();
                return;
            case 12:
                mgn mgnVar = (mgn) obj;
                if (mgnVar != null) {
                    mgf mgfVar = (mgf) this.a;
                    mgfVar.e = mgnVar;
                    mgfVar.a();
                    return;
                }
                return;
            case 13:
                ((myl) this.a).c.c(new mzq(this, (ram) obj, i));
                return;
            default:
                ram ramVar = (ram) obj;
                if (ramVar == ram.SETUP_COMPLETE) {
                    ((myl) this.a).g.d(luf.aN, true);
                    return;
                }
                Object obj8 = this.a;
                ramVar.getClass();
                ram ramVar2 = ram.NEEDS_ONBOARDING;
                myl mylVar = (myl) obj8;
                rah rahVar = mylVar.j;
                if (ramVar == ramVar2) {
                    ((mni) rahVar.c).m(9, -1, (View) rahVar.d);
                } else {
                    Object obj9 = rahVar.e;
                    TextView textView = (TextView) ((FrameLayout) obj9).findViewById(R.id.ineligible_reason);
                    int iOrdinal = ramVar.ordinal();
                    if (iOrdinal == 2) {
                        textView.setText(R.string.mars_not_available_reason_account);
                    } else if (iOrdinal == 6) {
                        textView.setText(R.string.mars_not_available_reason_work_profile);
                    }
                    ((mni) rahVar.c).m(9, R.string.mars_not_available, (View) obj9);
                }
                mylVar.d();
                return;
        }
    }
}
