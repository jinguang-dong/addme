package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rig {
    public int a;
    public int b;
    private int c;
    private final Object d;

    public rig(View view) {
        this.d = view;
    }

    private final void h() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.a) || (i2 == i && this.c == 0))) {
            z = true;
        }
        coi.x(z);
    }

    public final void a() {
        View view = (View) this.d;
        int top = this.b - (view.getTop() - this.a);
        int[] iArr = con.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.c));
    }

    public final void b() {
        View view = (View) this.d;
        this.a = view.getTop();
        this.c = view.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }

    public final int d(int i) {
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            Object obj = this.d;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
        }
        Object obj2 = this.d;
        int i6 = this.b;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        h();
        return i9;
    }

    public final void e() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        h();
    }

    public final void f(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        h();
    }

    public final boolean g() {
        int i = ((byte[]) this.d)[this.b] & (128 >> this.c);
        e();
        return i != 0;
    }

    public rig(byte[] bArr) {
        this.d = bArr;
        this.a = bArr.length;
    }

    public rig() {
        this.d = cza.a;
    }
}
