package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pex implements pdj {
    final /* synthetic */ pey a;

    public pex(pey peyVar) {
        this.a = peyVar;
    }

    @Override // defpackage.pdj
    public final Integer a() {
        return this.a.e;
    }

    @Override // defpackage.pdj
    public final Integer b() {
        return this.a.d;
    }

    @Override // defpackage.pdj
    public final Integer c() {
        return this.a.f;
    }

    @Override // defpackage.pdj
    public final Integer d() {
        return this.a.c;
    }

    @Override // defpackage.pdj
    public final Integer e() {
        return this.a.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pdj) {
            pdj pdjVar = (pdj) obj;
            if (Objects.equals(d(), pdjVar.d()) && Objects.equals(b(), pdjVar.b()) && Objects.equals(a(), pdjVar.a()) && Objects.equals(c(), pdjVar.c()) && Objects.equals(e(), pdjVar.e()) && Arrays.equals(g(), pdjVar.g()) && Arrays.equals(f(), pdjVar.f()) && Arrays.equals(h(), pdjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] f() {
        return this.a.i;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] g() {
        return this.a.h;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] h() {
        return this.a.j;
    }

    public final int hashCode() {
        pey peyVar = this.a;
        return Objects.hash(peyVar.c, peyVar.d, peyVar.e, peyVar.f, peyVar.g, Integer.valueOf(Arrays.hashCode(peyVar.h)), Integer.valueOf(Arrays.hashCode(peyVar.i)), Integer.valueOf(Arrays.hashCode(peyVar.j)));
    }
}
