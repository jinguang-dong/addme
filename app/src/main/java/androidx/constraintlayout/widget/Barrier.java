package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.cjk;
import defpackage.ckj;
import defpackage.cky;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Barrier extends ckj {
    public int a;
    public cjk b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.ckj
    protected final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cky.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.f = typedArrayObtainStyledAttributes.getString(35);
                    e(this.f);
                } else if (index == 36) {
                    this.g = typedArrayObtainStyledAttributes.getString(36);
                    f(this.g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.b = new cjk();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, cky.b);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    this.a = typedArrayObtainStyledAttributes2.getInt(26, 0);
                } else if (index2 == 25) {
                    this.b.b = typedArrayObtainStyledAttributes2.getBoolean(25, true);
                } else if (index2 == 27) {
                    this.b.c = typedArrayObtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.i = this.b;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // defpackage.ckj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.cjn r5, boolean r6) {
        /*
            r4 = this;
            int r4 = r4.a
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            if (r6 == 0) goto Lf
            if (r4 != r3) goto Lc
        La:
            r4 = r0
            goto L16
        Lc:
            if (r4 != r2) goto L16
            goto L11
        Lf:
            if (r4 != r3) goto L13
        L11:
            r4 = r1
            goto L16
        L13:
            if (r4 != r2) goto L16
            goto La
        L16:
            boolean r6 = r5 instanceof defpackage.cjk
            if (r6 == 0) goto L1e
            cjk r5 = (defpackage.cjk) r5
            r5.a = r4
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.b(cjn, boolean):void");
    }

    public final void c(int i) {
        this.b.c = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
