package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rok {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public rok() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            rog rogVar = new rog(f4, f5, f4, f5);
            rogVar.e = this.d;
            rogVar.f = f3;
            this.g.add(new roj());
            this.d = f;
        }
    }

    final roj a(Matrix matrix) {
        g(this.e);
        new Matrix(matrix);
        new ArrayList(this.g);
        return new roj();
    }

    public final void b(roj rojVar, float f, float f2) {
        g(f);
        this.g.add(rojVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((roi) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        roh rohVar = new roh();
        rohVar.a = f;
        rohVar.b = f2;
        this.f.add(rohVar);
        rof rofVar = new rof(rohVar, this.b, this.c);
        b(rofVar, rofVar.a() + 270.0f, rofVar.a() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
