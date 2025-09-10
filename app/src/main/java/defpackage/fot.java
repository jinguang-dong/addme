package defpackage;

import com.google.ar.core.Plane;
import java.nio.FloatBuffer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fot extends fok implements fnm {
    public final foy b;

    public fot(Plane plane, foy foyVar) {
        super(plane);
        this.b = foyVar;
    }

    @Override // defpackage.fnm
    public final float a() {
        final Plane plane = (Plane) this.a;
        plane.getClass();
        return ((Float) ezh.k(new Supplier() { // from class: for
            @Override // java.util.function.Supplier
            public final Object get() {
                return Float.valueOf(plane.getExtentX());
            }
        })).floatValue();
    }

    @Override // defpackage.fnm
    public final float b() {
        final Plane plane = (Plane) this.a;
        plane.getClass();
        return ((Float) ezh.k(new Supplier() { // from class: fos
            @Override // java.util.function.Supplier
            public final Object get() {
                return Float.valueOf(plane.getExtentZ());
            }
        })).floatValue();
    }

    @Override // defpackage.fnm
    public final fnm c() {
        try {
            return (fnm) new fog(this, 20).get();
        } catch (RuntimeException e) {
            throw ezh.l(e);
        }
    }

    @Override // defpackage.fnm
    public final fnp d() {
        return (fnp) ezh.k(new foq(this, 0));
    }

    @Override // defpackage.fok
    public final fnt dO() {
        return (fnt) ezh.k(new foq(this, 1));
    }

    @Override // defpackage.fnm
    public final FloatBuffer f() {
        final Plane plane = (Plane) this.a;
        plane.getClass();
        return (FloatBuffer) ezh.k(new Supplier() { // from class: fop
            @Override // java.util.function.Supplier
            public final Object get() {
                return plane.getPolygon();
            }
        });
    }

    @Override // defpackage.fnm
    public final boolean g(fnp fnpVar) {
        return ((Boolean) ezh.k(new foj((fok) this, (Object) fnpVar, 5))).booleanValue();
    }

    @Override // defpackage.fnr
    public final foi h(fnp fnpVar) {
        return (foi) ezh.k(new foj((fok) this, (Object) fnpVar, 4));
    }
}
