package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dtc extends FrameLayout {
    final ArrayList a;
    private final Context b;
    private dtb c;
    private final AmbientModeSupport.AmbientController d;

    public dtc(Context context) {
        this(context, null);
    }

    protected void a() {
        dss.b(this);
    }

    protected void b() {
        dss.b(this);
    }

    protected void c() {
        dss.b(this);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        dtb dtbVar = this.c;
        return dtbVar != null ? i < 0 && dtbVar.a.getVisibility() == 0 : super.canScrollHorizontally(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            dtb r0 = r9.c
            if (r0 == 0) goto Ld4
            r0.a(r10)
            boolean r9 = r0.m
            r6 = 1
            if (r9 == 0) goto Ld
            return r6
        Ld:
            float r9 = r10.getRawX()
            float r1 = r10.getX()
            float r9 = r9 - r1
            r7 = 0
            r10.offsetLocation(r9, r7)
            int r1 = r10.getActionMasked()
            r8 = 0
            if (r1 == 0) goto La3
            if (r1 == r6) goto L9f
            r2 = 2
            if (r1 == r2) goto L56
            r2 = 3
            if (r1 == r2) goto L9f
            r2 = 5
            if (r1 == r2) goto L4a
            r2 = 6
            if (r1 == r2) goto L31
            goto Lc5
        L31:
            int r1 = r10.getActionIndex()
            int r2 = r10.getPointerId(r1)
            int r3 = r0.f
            if (r2 != r3) goto Lc5
            if (r1 != 0) goto L41
            r1 = r6
            goto L42
        L41:
            r1 = r8
        L42:
            int r1 = r10.getPointerId(r1)
            r0.f = r1
            goto Lc5
        L4a:
            int r1 = r10.getActionIndex()
            int r1 = r10.getPointerId(r1)
            r0.f = r1
            goto Lc5
        L56:
            dtj r1 = r0.e
            android.view.VelocityTracker r1 = r1.f
            if (r1 == 0) goto Lc5
            boolean r1 = r0.l
            if (r1 != 0) goto Lc5
            int r1 = r0.f
            int r1 = r10.findPointerIndex(r1)
            r2 = -1
            if (r1 != r2) goto L73
            java.lang.String r1 = "SwipeDismissController"
            java.lang.String r2 = "Invalid pointer index: ignoring."
            android.util.Log.e(r1, r2)
            r0.l = r6
            goto Lc5
        L73:
            float r2 = r10.getRawX()
            float r3 = r0.g
            float r3 = r2 - r3
            float r4 = r10.getX(r1)
            float r5 = r10.getY(r1)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L9b
            float r1 = r0.g
            float r2 = r0.d
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L9b
            dtc r1 = r0.a
            r2 = 0
            boolean r1 = r0.d(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L9b
            r0.l = r6
            goto Lc5
        L9b:
            r0.c(r10)
            goto Lc5
        L9f:
            r0.b()
            goto Lc5
        La3:
            r0.b()
            float r1 = r10.getRawX()
            r0.g = r1
            float r1 = r10.getRawY()
            r0.h = r1
            int r1 = r10.getPointerId(r8)
            r0.f = r1
            dtj r1 = r0.e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r1.f = r2
            android.view.VelocityTracker r1 = r1.f
            r1.addMovement(r10)
        Lc5:
            float r9 = -r9
            r10.offsetLocation(r9, r7)
            boolean r9 = r0.l
            if (r9 != 0) goto Ld3
            boolean r9 = r0.j
            if (r9 != 0) goto Ld2
            return r8
        Ld2:
            return r6
        Ld3:
            return r8
        Ld4:
            boolean r9 = super.onInterceptTouchEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtc.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dtb dtbVar = this.c;
        if (dtbVar != null) {
            dtbVar.a(motionEvent);
            int i = 1;
            if (!dtbVar.m) {
                dtj dtjVar = dtbVar.e;
                if (dtjVar.f != null) {
                    float rawX = motionEvent.getRawX() - motionEvent.getX();
                    motionEvent.offsetLocation(rawX, 0.0f);
                    int actionMasked = motionEvent.getActionMasked();
                    int i2 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            dtjVar.f.addMovement(motionEvent);
                            dtbVar.i = motionEvent.getRawX();
                            dtbVar.c(motionEvent);
                            if (dtbVar.j) {
                                float rawX2 = motionEvent.getRawX() - dtbVar.g;
                                if (!dtjVar.g) {
                                    dtjVar.g = true;
                                    ViewGroup viewGroupA = dtjVar.a();
                                    if (viewGroupA != null) {
                                        if (dtjVar.n == null) {
                                            dtjVar.n = viewGroupA.getBackground();
                                        }
                                        Drawable drawable = dtjVar.n;
                                        viewGroupA.setBackground(drawable != null ? new LayerDrawable(new Drawable[]{drawable, dtjVar.c}) : dtjVar.c);
                                        Paint paint = dtjVar.e;
                                        paint.setColorFilter(null);
                                        dtc dtcVar = dtjVar.a;
                                        dtcVar.setLayerType(2, paint);
                                        dtcVar.setOutlineProvider(new dti(dtjVar.d));
                                        dtcVar.setClipToOutline(true);
                                    }
                                }
                                dtjVar.f.addMovement(motionEvent);
                                dtc dtcVar2 = dtjVar.a;
                                float width = rawX2 / dtcVar2.getWidth();
                                dtjVar.j = width;
                                float f = (width * (-0.3f)) + 1.0f;
                                dtjVar.i = f;
                                dtjVar.h = (Math.max(0.0f, 1.0f - f) * dtcVar2.getWidth()) / 2.0f;
                                dtjVar.k = Math.min(0.3f, dtjVar.j / 2.0f);
                                dtjVar.e();
                            }
                        } else if (actionMasked == 3) {
                        }
                        motionEvent.offsetLocation(-rawX, 0.0f);
                    } else {
                        float rawX3 = motionEvent.getRawX() - dtbVar.g;
                        VelocityTracker velocityTracker = dtjVar.f;
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        float yVelocity = velocityTracker.getYVelocity();
                        if (dtbVar.i == -2.1474836E9f) {
                            xVelocity = rawX3 / ((motionEvent.getEventTime() - motionEvent.getDownTime()) / 1000.0f);
                        }
                        if (!dtbVar.k && ((rawX3 > dtbVar.a.getWidth() * 0.33f && motionEvent.getRawX() >= dtbVar.i) || (xVelocity >= dtbVar.c && xVelocity > Math.abs(yVelocity)))) {
                            dtbVar.k = true;
                        }
                        if (dtbVar.k && dtbVar.j && xVelocity < (-dtbVar.c)) {
                            dtbVar.k = false;
                        }
                    }
                    if (dtbVar.k) {
                        AmbientModeSupport.AmbientController ambientController = dtbVar.n;
                        if (dtjVar.f == null) {
                            dtjVar.f = VelocityTracker.obtain();
                        }
                        dtjVar.f.computeCurrentVelocity(1000);
                        if (ambientController != null) {
                            ((dtc) ambientController.a).c();
                        }
                        dtjVar.l = dtjVar.b(dtjVar.h, dtjVar.b, dtjVar.f.getXVelocity(), new dtg(dtjVar, i2), new dth(dtjVar, ambientController, i2));
                    } else if (dtbVar.j && dtbVar.i != -2.1474836E9f) {
                        AmbientModeSupport.AmbientController ambientController2 = dtbVar.n;
                        dtjVar.f.computeCurrentVelocity(1000);
                        dtjVar.m = dtjVar.b(dtjVar.h, 0.0f, dtjVar.f.getXVelocity(), new dtg(dtjVar, i), new dth(dtjVar, ambientController2, i));
                    }
                    dtbVar.b();
                    motionEvent.offsetLocation(-rawX, 0.0f);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        dtb dtbVar = this.c;
        if (dtbVar == null) {
            super.requestDisallowInterceptTouchEvent(z);
            return;
        }
        dtc dtcVar = dtbVar.a;
        if (dtcVar.getParent() != null) {
            dtcVar.getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public dtc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dtc(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public dtc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = null;
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        this.d = ambientController;
        this.a = new ArrayList();
        this.b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.windowSwipeToDismiss});
        boolean z = typedArrayObtainStyledAttributes.getIndexCount() > 0 ? typedArrayObtainStyledAttributes.getBoolean(0, true) : false;
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            if (this.c == null) {
                dtb dtbVar = new dtb(context, this);
                this.c = dtbVar;
                dtbVar.n = ambientController;
                return;
            }
            return;
        }
        dtb dtbVar2 = this.c;
        if (dtbVar2 != null) {
            dtbVar2.n = null;
            this.c = null;
        }
    }
}
