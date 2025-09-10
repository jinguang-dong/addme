package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhs extends com {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public dhs() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    @Override // defpackage.com
    public final boolean p() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((com) arrayList.get(i)).p()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.com
    public final boolean q(int[] iArr) {
        int i = 0;
        boolean zQ = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zQ;
            }
            zQ |= ((com) arrayList.get(i)).q(iArr);
            i++;
        }
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            z();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            z();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            z();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            z();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            z();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            z();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            z();
        }
    }

    public final void z() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public dhs(dhs dhsVar, yd ydVar) {
        dht dhqVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = dhsVar.c;
        this.d = dhsVar.d;
        this.e = dhsVar.e;
        this.f = dhsVar.f;
        this.g = dhsVar.g;
        this.h = dhsVar.h;
        this.i = dhsVar.i;
        int[] iArr = dhsVar.l;
        this.l = null;
        String str = dhsVar.m;
        this.m = str;
        int i = dhsVar.k;
        this.k = 0;
        if (str != null) {
            ydVar.put(str, this);
        }
        matrix.set(dhsVar.j);
        ArrayList arrayList = dhsVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof dhs) {
                this.b.add(new dhs((dhs) obj, ydVar));
            } else {
                if (obj instanceof dhr) {
                    dhqVar = new dhr((dhr) obj);
                } else if (obj instanceof dhq) {
                    dhqVar = new dhq((dhq) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(dhqVar);
                Object obj2 = dhqVar.n;
                if (obj2 != null) {
                    ydVar.put(obj2, dhqVar);
                }
            }
        }
    }
}
