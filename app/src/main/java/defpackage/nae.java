package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nae extends LinearLayout {
    public static final sgv a = sgv.g("nae");
    private static final nlh s = new nlh();
    public final ryq b;
    public final HashMap c;
    public final EnumSet d;
    public final EnumMap e;
    public boolean f;
    public View g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public nkw l;
    public nkx m;
    public Drawable n;
    public Animator o;
    public nai p;
    public rwc q;
    public int r;
    private Animator t;
    private Boolean u;
    private int v;
    private hbj w;

    /* JADX WARN: Multi-variable type inference failed */
    public nae(Context context) throws Resources.NotFoundException {
        super(context);
        this.b = new saa(nkw.class);
        this.c = new HashMap();
        this.d = EnumSet.noneOf(nkw.class);
        this.e = new EnumMap(nkw.class);
        this.u = null;
        this.r = 1;
        this.m = nkx.PHOTO;
        this.q = rvk.a;
        out.a();
        boolean z = context instanceof fdi;
        Resources resources = context.getResources();
        if (z) {
            fdi fdiVar = (fdi) context;
            this.w = fdiVar.b();
            fdiVar.b();
            gzi gziVar = gzj.a;
            this.k = this.w.p(gzo.bw);
        }
        setVisibility(4);
        setAlpha(0.0f);
        this.u = false;
        this.h = qpt.P(this, R.attr.colorOnSecondary);
        this.i = this.k ? -1 : qpt.P(this, R.attr.colorOnSurface);
        int iP = qpt.P(this, R.attr.colorSecondary);
        this.j = iP;
        if (this.k) {
            this.p = new nai(context, iP, this.h);
        } else {
            this.v = resources.getInteger(R.integer.move_accent_animation_duration);
            Drawable drawable = resources.getDrawable(R.drawable.mode_chip, null);
            this.n = drawable;
            drawable.setVisible(true, true);
            new nac(this, 1).a(this.j);
        }
        addOnLayoutChangeListener(new fvf(this, 6));
    }

    public static TextView b(View view) {
        return (TextView) view.findViewById(R.id.mode_chip_text);
    }

    private static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static TextView j(View view) {
        if (view != null) {
            return b(view);
        }
        return null;
    }

    private final void k(View view) {
        View view2 = this.g;
        if (view2 != null) {
            view2.setSelected(false);
            l(view2, false);
        }
        this.g = view;
        view.setSelected(true);
        l(view, true);
    }

    private final void l(View view, boolean z) {
        String strB;
        if (view != null) {
            if (z) {
                strB = b(view).getText().toString();
            } else {
                nkw nkwVar = (nkw) ((rxk) this.b).b.get(view);
                nkwVar.getClass();
                strB = nkt.a(nkwVar).b(getContext().getResources());
            }
            b(view).setContentDescription(strB);
        }
    }

    public final View a(nkw nkwVar) throws Resources.NotFoundException {
        out.a();
        Resources resources = getContext().getResources();
        nkt nktVarA = nkt.a(nkwVar);
        String strC = nktVarA.c(resources);
        String strB = nktVarA.b(resources);
        Object obj = this.b.get(nkwVar);
        rnt.M(obj == null, mn.i(nkwVar, "mode ", " is registered already."));
        Context context = getContext();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.mode_name, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, context.getResources().getDimensionPixelOffset(R.dimen.mode_chip_height)));
        viewInflate.findViewById(R.id.guidance_background).setVisibility(4);
        TextView textViewB = b(viewInflate);
        textViewB.setText(strC);
        textViewB.setContentDescription(strB);
        textViewB.setSoundEffectsEnabled(false);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mode_chip_horizontal_padding);
        textViewB.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        return viewInflate;
    }

    public final void c(nkw nkwVar, boolean z) {
        out.a();
        ryq ryqVar = this.b;
        if (ryqVar.isEmpty()) {
            return;
        }
        View view = (View) ryqVar.get(nkwVar);
        rnt.B(view != null, "attempted to activate non-existent mode ".concat(String.valueOf(String.valueOf(nkwVar))));
        if (view.getWidth() != 0) {
            if (this.g != view) {
                if (z) {
                    f(nkwVar);
                } else {
                    g(view);
                }
            }
            b(view).getText();
            view.getLeft();
            view.getRight();
            if (this.q.h()) {
                ((ModeSwitcher) ((rnu) this.q.c()).a).f((view.getLeft() + view.getRight()) / 2, z);
            }
        }
    }

    public final void d(View view, nkw nkwVar) {
        out.a();
        this.b.put(nkwVar, view);
        Resources resources = getContext().getResources();
        int[] iArr = con.a;
        int layoutDirection = getLayoutDirection();
        nay nayVar = new nay(getContext(), b(view));
        boolean z = layoutDirection == 1;
        nayVar.e.set(z ? (int) resources.getDimension(R.dimen.notification_dot_horiz_padding) : 0, (int) resources.getDimension(R.dimen.notification_dot_top_padding), z ? 0 : (int) resources.getDimension(R.dimen.notification_dot_horiz_padding), 0);
        this.e.put((EnumMap) nkwVar, (nkw) nayVar);
        addView(view);
    }

    public final void e(boolean z, boolean z2) {
        if (!z2) {
            Animator animator = this.t;
            if (animator != null) {
                animator.end();
            }
            setAlpha(true != z ? 0.0f : 1.0f);
            this.u = Boolean.valueOf(z);
            return;
        }
        Boolean bool = this.u;
        if (bool == null || bool.booleanValue() == z) {
            return;
        }
        Animator animator2 = this.t;
        if (animator2 != null) {
            animator2.end();
        }
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        if (this.k) {
            objectAnimatorOfFloat.addUpdateListener(new cot(this, 12, null));
        }
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setStartDelay(217L);
        objectAnimatorOfFloat.start();
        this.t = objectAnimatorOfFloat;
        this.u = Boolean.valueOf(z);
    }

    public final void f(nkw nkwVar) {
        if (this.k) {
            k((View) this.b.get(nkwVar));
            invalidate();
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.end();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.v);
        Rect bounds = this.n.getBounds();
        Drawable drawable = this.n;
        nlh nlhVar = s;
        ryq ryqVar = this.b;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(drawable, "bounds", nlhVar, bounds, i((View) ryqVar.get(nkwVar)));
        objectAnimatorOfObject.addUpdateListener(new cot(this, 11, null));
        objectAnimatorOfObject.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(j(this.g), "textColor", this.h, this.i);
        objectAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        k((View) ryqVar.get(nkwVar));
        ObjectAnimator objectAnimatorOfArgb2 = ObjectAnimator.ofArgb(j(this.g), "textColor", this.i, this.h);
        objectAnimatorOfArgb2.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfObject).with(objectAnimatorOfArgb2).with(objectAnimatorOfArgb);
        invalidate();
        animatorSet.start();
        this.o = animatorSet;
    }

    public final void g(View view) {
        if (!this.k) {
            Animator animator = this.o;
            if (animator != null) {
                animator.end();
            }
            View view2 = this.g;
            if (view2 != null) {
                b(view2).setTextColor(this.i);
            }
            b(view).setTextColor(this.h);
            this.n.setBounds(i(view));
        }
        k(view);
        invalidate();
    }

    public final void h() {
        for (View view : this.b.values()) {
            if (this.k || !view.equals(this.g)) {
                b(view).setTextColor(this.i);
            } else {
                b(view).setTextColor(this.h);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.k) {
            return;
        }
        if (this.n.isVisible()) {
            this.n.draw(canvas);
        } else {
            ((sgt) a.c().M(5239)).s("highlight chip is not visible");
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnumSet enumSetCopyOf;
        nay nayVar;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.r;
        boolean z2 = true;
        if (i5 == 2 || i5 == 3) {
            out.a();
            synchronized (this) {
                if (this.f) {
                    enumSetCopyOf = EnumSet.copyOf(this.d);
                    this.f = false;
                } else {
                    enumSetCopyOf = null;
                }
            }
            if (enumSetCopyOf != null) {
                ryq ryqVar = this.b;
                for (nkw nkwVar : ryqVar.keySet()) {
                    View view2 = (View) ryqVar.get(nkwVar);
                    view2.getClass();
                    boolean z3 = b(view2).getForeground() == null ? false : z2;
                    boolean zContains = enumSetCopyOf.contains(nkwVar);
                    if (z3 != zContains && (nayVar = (nay) this.e.get(nkwVar)) != null) {
                        if (zContains) {
                            View view3 = nayVar.b;
                            Rect rect = new Rect(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            Drawable drawable = nayVar.a.getDrawable(R.drawable.notification_dot);
                            int intrinsicWidth = view3.getResources().getConfiguration().getLayoutDirection() == z2 ? 0 : drawable.getIntrinsicWidth() / 2;
                            int iWidth = rect.width() - drawable.getIntrinsicWidth();
                            Rect rect2 = nayVar.e;
                            view3.setForeground(new InsetDrawable(drawable, (iWidth - rect2.right) + intrinsicWidth, rect2.top, rect2.right - intrinsicWidth, (rect.height() - drawable.getIntrinsicHeight()) - rect2.top));
                        } else {
                            View view4 = nayVar.b;
                            Drawable foreground = view4.getForeground();
                            if (foreground != null) {
                                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(foreground, "alpha", 255, 0);
                                objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfInt.addUpdateListener(new cot(nayVar, 13, null));
                                objectAnimatorOfInt.setDuration(nayVar.d);
                                objectAnimatorOfInt.setStartDelay(nayVar.c);
                                objectAnimatorOfInt.addListener(new nax(nayVar));
                                objectAnimatorOfInt.start();
                            } else {
                                view4.setForeground(null);
                            }
                        }
                        z2 = true;
                    }
                }
            }
        }
        if (this.r == 2) {
            if (this.p != null) {
                ArrayList<View> arrayList = new ArrayList(getChildCount());
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    arrayList.add(getChildAt(i6));
                }
                nai naiVar = this.p;
                if (!arrayList.isEmpty()) {
                    int left = (((View) arrayList.get(0)).getLeft() + ((View) arrayList.get(0)).getRight()) / 2;
                    ArrayList arrayList2 = new ArrayList(ske.bq(arrayList, 10));
                    for (View view5 : arrayList) {
                        arrayList2.add(new nah(naiVar, ((TextView) view5.findViewById(R.id.mode_chip_text)).getText().toString(), view5.getLeft() - left, view5.getRight() - left));
                    }
                    naiVar.l = arrayList2;
                }
            }
            rnt.L(this.r == 2);
            int[] iArr = con.a;
            int layoutDirection = getLayoutDirection();
            nkw nkwVar2 = this.l;
            nkwVar2.getClass();
            c(nkwVar2, layoutDirection == 1);
            if (isEnabled()) {
                setVisibility(0);
                e(true, false);
            }
            this.r = 3;
        }
        if (this.k || (view = this.g) == null) {
            return;
        }
        this.n.setBounds(i(view));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        out.a();
        Size size = new Size(i, i2);
        HashMap map = this.c;
        HashMap map2 = (HashMap) map.get(this.m);
        if (map2 == null) {
            map2 = new HashMap();
        }
        nad nadVar = (nad) map2.get(size);
        if (nadVar == null) {
            nadVar = new nad();
            int i3 = 0;
            int measuredWidth2 = 0;
            int iMax = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                measuredWidth2 += getChildAt(i4).getMeasuredWidth();
                iMax = Math.max(iMax, getChildAt(i4).getMeasuredHeight());
            }
            nadVar.a = measuredWidth2;
            nadVar.b = iMax;
            boolean z = measuredWidth2 > 0 && iMax > 0;
            int size2 = View.MeasureSpec.getSize(i);
            int[] iArr = con.a;
            int layoutDirection = getLayoutDirection();
            if (getChildCount() > 0) {
                boolean z2 = layoutDirection == 1;
                View childAt = z2 ? getChildAt(getChildCount() - 1) : getChildAt(0);
                View childAt2 = z2 ? getChildAt(0) : getChildAt(getChildCount() - 1);
                if (childAt != null && childAt2 != null && childAt.getMeasuredWidth() > 0 && childAt2.getMeasuredWidth() > 0) {
                    int measuredWidth3 = size2 - childAt.getMeasuredWidth();
                    measuredWidth = (size2 - childAt2.getMeasuredWidth()) / 2;
                    i3 = measuredWidth3 / 2;
                }
                if (z && i3 != 0) {
                    map2.put(size, nadVar);
                    map.put(this.m, map2);
                }
            } else {
                measuredWidth = 0;
            }
            nadVar.c = i3;
            nadVar.d = measuredWidth;
            i3 = 1;
            if (z) {
                map2.put(size, nadVar);
                map.put(this.m, map2);
            }
        }
        setPadding(nadVar.c, getPaddingTop(), nadVar.d, getPaddingBottom());
        setMeasuredDimension(resolveSize(nadVar.a + nadVar.c + nadVar.d, i), resolveSize(nadVar.b, i2));
    }
}
