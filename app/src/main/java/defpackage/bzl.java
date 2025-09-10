package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzl {
    public static final bzj a = new bzj();
    public final Rect b = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final bzk f = new bzk();
    public final ArrayList c = new ArrayList();

    private final View b(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i) {
        Rect rect2 = this.d;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!a.ao(view3, view) && !a.ao(view3, viewGroup)) {
                Rect rect3 = this.e;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                bkg bkgVarE = blb.e(rect3);
                bkg bkgVarE2 = blb.e(rect2);
                bkg bkgVarE3 = blb.e(rect);
                bjm bjmVarV = bdq.v(i);
                if (acv.s(bkgVarE, bkgVarE2, bkgVarE3, bjmVarV != null ? bjmVarV.a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, android.view.ViewGroup] */
    public final View a(ViewGroup viewGroup, View view, int i) throws Throwable {
        ArrayList arrayList;
        ArrayList<View> arrayList2;
        View viewB;
        ArrayList<View> arrayList3;
        View viewB2;
        int i2;
        int i3;
        ViewGroup viewGroup2 = viewGroup;
        if (view != viewGroup2) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup2) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        View viewO = bad.o(view, viewGroup2, i);
        View viewO2 = viewO;
        int i4 = true;
        while (viewO != null) {
            if (viewO.isFocusable() && viewO.getVisibility() == 0 && (!viewO.isInTouchMode() || viewO.isFocusableInTouchMode())) {
                break;
            }
            viewO = bad.o(viewO, viewGroup2, i);
            int i5 = i4 ^ true;
            if (i4 == false) {
                viewO2 = viewO2 != null ? bad.o(viewO2, viewGroup2, i) : null;
                if (viewO2 == viewO) {
                    break;
                }
            }
            i4 = i5;
        }
        viewO = null;
        if (viewO != null) {
            return viewO;
        }
        ArrayList<View> arrayList4 = this.c;
        try {
            arrayList4.clear();
            viewGroup2.addFocusables(arrayList4, i, viewGroup2.isInTouchMode() ? 1 : 0);
        } catch (Throwable th) {
            th = th;
            arrayList = arrayList4;
        }
        if (!arrayList4.isEmpty()) {
            Rect rect = this.b;
            view.getFocusedRect(rect);
            viewGroup2.offsetDescendantRectToMyCoords(view, rect);
            if (i == 1 || i == 2) {
                arrayList = viewGroup2;
                arrayList3 = arrayList4;
                try {
                    try {
                        bzk bzkVar = this.f;
                        int size = arrayList3.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            bzkVar.d.g(arrayList3.get(i6), i6);
                        }
                        int i7 = -1;
                        int size2 = arrayList3.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i8 = size2 - 1;
                                View view2 = arrayList3.get(size2);
                                int nextFocusForwardId = view2.getNextFocusForwardId();
                                View viewO3 = (nextFocusForwardId == 0 || nextFocusForwardId == i7) ? null : bad.o(view2, arrayList, 2);
                                if (viewO3 != null) {
                                    i3 = i7;
                                    if (bzkVar.d.a(viewO3) >= 0) {
                                        bzkVar.a.j(view2, viewO3);
                                        bzkVar.b.j(viewO3);
                                    }
                                } else {
                                    i3 = i7;
                                }
                                if (i8 < 0) {
                                    break;
                                }
                                size2 = i8;
                                i7 = i3;
                            }
                        }
                        int size3 = arrayList3.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i9 = size3 - 1;
                                View view3 = arrayList3.get(size3);
                                zu zuVar = bzkVar.a;
                                if (((View) zuVar.a(view3)) != null && !bzkVar.b.a(view3)) {
                                    View view4 = view3;
                                    while (view3 != null) {
                                        zu zuVar2 = bzkVar.c;
                                        View view5 = (View) zuVar2.a(view3);
                                        if (view5 != null) {
                                            if (view5 == view4) {
                                                break;
                                            }
                                            view3 = view4;
                                            view4 = view5;
                                        }
                                        zuVar2.j(view3, view4);
                                        view3 = (View) zuVar.a(view3);
                                    }
                                }
                                if (i9 < 0) {
                                    break;
                                }
                                size3 = i9;
                            }
                        }
                        Collections.sort(arrayList3, bzkVar);
                        try {
                            this.f.a();
                            int size4 = arrayList3.size();
                            if (size4 < 2) {
                                arrayList2 = arrayList3;
                                viewB = null;
                            } else {
                                if (i == 1) {
                                    arrayList2 = arrayList3;
                                    int iIndexOf = arrayList2.indexOf(view);
                                    viewB2 = iIndexOf > 0 ? arrayList2.get(iIndexOf - 1) : arrayList2.get(size4 - 1);
                                } else if (i == 2) {
                                    arrayList2 = arrayList3;
                                    int iLastIndexOf = arrayList2.lastIndexOf(view);
                                    viewB2 = (iLastIndexOf < 0 || (i2 = iLastIndexOf + 1) >= size4) ? arrayList2.get(0) : arrayList2.get(i2);
                                } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                                    try {
                                        viewB2 = b(arrayList, view, this.b, arrayList3, i);
                                        arrayList2 = arrayList3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        arrayList = arrayList3;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    viewB2 = null;
                                }
                                viewB = viewB2 == null ? arrayList2.get(size4 - 1) : viewB2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            arrayList = arrayList3;
                            arrayList.clear();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        this.f.a();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                if (i != 17 && i != 33 && i != 66 && i != 130) {
                    throw new IllegalArgumentException(a.bv(i, "Unknown direction: "));
                }
                try {
                    viewB = b(viewGroup2, view, rect, arrayList4, i);
                    arrayList2 = arrayList4;
                } catch (Throwable th6) {
                    th = th6;
                    arrayList3 = arrayList4;
                    arrayList = arrayList3;
                    arrayList.clear();
                    throw th;
                }
            }
            arrayList.clear();
            throw th;
        }
        arrayList2 = arrayList4;
        viewB = viewO;
        arrayList2.clear();
        return viewB;
    }
}
