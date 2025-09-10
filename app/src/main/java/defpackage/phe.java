package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phe implements pdj {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final MeteringRectangle[] d;
    public final MeteringRectangle[] e;
    public final MeteringRectangle[] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public phe(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.a = Boolean.valueOf(z);
        this.b = Boolean.valueOf(z2);
        this.c = Boolean.valueOf(z3);
        this.d = meteringRectangleArr;
        this.e = meteringRectangleArr2;
        this.f = meteringRectangleArr3;
    }

    @Override // defpackage.pdj
    public final Integer a() {
        return Integer.valueOf(this.i);
    }

    @Override // defpackage.pdj
    public final Integer b() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.pdj
    public final Integer c() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.pdj
    public final Integer d() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.pdj
    public final Integer e() {
        return Integer.valueOf(this.k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof phe) {
            phe pheVar = (phe) obj;
            if (Objects.equals(Integer.valueOf(this.g), pheVar.d()) && Objects.equals(b(), pheVar.b()) && Objects.equals(a(), pheVar.a()) && Objects.equals(c(), pheVar.c()) && Objects.equals(e(), pheVar.e()) && Arrays.equals(this.d, pheVar.d) && Arrays.equals(this.e, pheVar.e) && Arrays.equals(this.f, pheVar.f) && Objects.equals(this.a, pheVar.a) && Objects.equals(this.b, pheVar.b) && Objects.equals(this.c, pheVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] f() {
        return this.e;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] g() {
        return this.d;
    }

    @Override // defpackage.pdj
    public final MeteringRectangle[] h() {
        return this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.a, this.b, this.c);
    }
}
