package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mut implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mut(SmartsChipView smartsChipView, lyr lyrVar, Runnable runnable, int i) {
        this.d = i;
        this.b = smartsChipView;
        this.a = lyrVar;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 5;
        if (this.d != 0) {
            lyr lyrVar = (lyr) this.a;
            lyrVar.f.z(5, lyrVar.a.a);
            this.c.run();
            SmartsChipView smartsChipView = (SmartsChipView) this.b;
            if (smartsChipView.d) {
                smartsChipView.b();
                return;
            }
            return;
        }
        muu muuVar = (muu) this.a;
        muuVar.a.startActivity((Intent) this.b);
        tpc tpcVarM = soh.a.m();
        rbb rbbVar = rbb.a;
        switch (((rbb) this.c).ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            default:
                throw new RuntimeException(null, null);
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        mdy mdyVar = muuVar.e;
        soh sohVar = (soh) tpcVarM.b;
        sohVar.c = i - 1;
        sohVar.b |= 1;
        soh sohVar2 = (soh) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CAMERA_HUB_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sohVar2.getClass();
        sodVar2.aI = sohVar2;
        sodVar2.e |= 16;
        mdyVar.I(tpcVarM2);
    }

    public /* synthetic */ mut(muu muuVar, Intent intent, rbb rbbVar, int i) {
        this.d = i;
        this.a = muuVar;
        this.b = intent;
        this.c = rbbVar;
    }
}
