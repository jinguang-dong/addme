package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxs extends gsn {
    final /* synthetic */ jxt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxs(jxt jxtVar) {
        super((int[]) null);
        this.a = jxtVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        this.a.b.e();
    }

    @Override // defpackage.gsn
    public final void g() {
        this.a.c();
    }

    @Override // defpackage.gsn
    public final void h() {
        jxt jxtVar = this.a;
        synchronized (jxtVar.d) {
            if (jxtVar.g == null) {
                return;
            }
            rnt.M(jxtVar.e.h(), "URI not set.");
            Intent intent = new Intent(TOnSyMaYeslEl.qQZDdW);
            intent.setFlags(1);
            intent.setDataAndType((Uri) jxtVar.e.c(), jxtVar.g.g.a.f.j);
            try {
                iyu iyuVar = jxtVar.h;
                iyuVar.u = false;
                intent.addFlags(ImageMetadata.LENS_APERTURE);
                iyuVar.J.c(intent);
            } catch (ActivityNotFoundException e) {
                ((sgt) ((sgt) jxt.a.b().i(e)).M(3140)).s("Couldn't view video");
            }
        }
    }
}
