package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjc implements poj, pns {
    private static final pof d = new pja();
    public final int a;
    public final int b;
    public final int c;
    private final Image f;
    private final long h;
    private volatile sbp i;
    private Rect j;
    private final Object e = new Object();
    private pof g = d;

    public pjc(Image image) {
        this.f = image;
        this.a = image.getFormat();
        this.b = image.getWidth();
        this.c = image.getHeight();
        this.h = image.getTimestamp();
    }

    @Override // defpackage.poj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.poj
    public final int b() {
        return this.c;
    }

    @Override // defpackage.poj
    public final int c() {
        return this.b;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            pof pofVar = this.g;
            if (pofVar != null) {
                Image image = this.f;
                this.g = null;
                pofVar.a(image);
            }
        }
    }

    @Override // defpackage.poj
    public final long d() {
        return this.h;
    }

    @Override // defpackage.poj
    public final Rect e() {
        Rect cropRect;
        synchronized (this.e) {
            try {
                try {
                    cropRect = this.f.getCropRect();
                    this.j = cropRect;
                } catch (IllegalStateException unused) {
                    return this.j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cropRect;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof poj)) {
            return false;
        }
        poj pojVar = (poj) obj;
        return pojVar.a() == this.a && pojVar.c() == this.b && pojVar.b() == this.c && pojVar.d() == this.h;
    }

    @Override // defpackage.poj
    public final HardwareBuffer f() {
        HardwareBuffer hardwareBuffer;
        try {
            synchronized (this.e) {
                hardwareBuffer = this.f.getHardwareBuffer();
            }
            return hardwareBuffer;
        } catch (IllegalStateException | NoSuchMethodError unused) {
            return null;
        }
    }

    @Override // defpackage.poj
    public final List g() {
        return k();
    }

    @Override // defpackage.poj
    public final void h(pof pofVar) {
        pof pofVar2;
        synchronized (this.e) {
            if (this.g == null) {
                pofVar.a(null);
                return;
            }
            synchronized (this.e) {
                pofVar2 = this.g;
                this.g = pofVar;
            }
            if (pofVar2 != null) {
                pofVar2.a(null);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.h)});
    }

    @Override // defpackage.poj
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pns
    public final qaq j() {
        qaq qaqVar;
        synchronized (this.e) {
            qaqVar = new qaq(this.f);
        }
        return qaqVar;
    }

    public final sbp k() {
        sbp sbpVarG;
        sbp sbpVar = this.i;
        if (sbpVar != null) {
            return sbpVar;
        }
        synchronized (this.e) {
            sbpVarG = this.i;
            if (sbpVarG == null) {
                Image.Plane[] planes = this.f.getPlanes();
                if (planes == null) {
                    int i = sbp.d;
                    sbpVarG = sex.a;
                } else {
                    sbk sbkVar = new sbk();
                    for (Image.Plane plane : planes) {
                        sbkVar.h(new pjb(plane));
                    }
                    sbpVarG = sbkVar.g();
                }
                this.i = sbpVarG;
            }
        }
        return sbpVarG;
    }

    public final String toString() {
        return "Image-" + qpt.ay(this.a) + "w" + this.b + "h" + this.c + "-" + this.h;
    }
}
