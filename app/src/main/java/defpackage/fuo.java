package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonBc25Impl;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fuo implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fuo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 0;
        switch (this.b) {
            case 0:
                mbj mbjVar = (mbj) this.a;
                mbjVar.i();
                mbjVar.h();
                return false;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    jz jzVar = (jz) this.a;
                    PopupWindow popupWindow = jzVar.q;
                    if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < jzVar.q.getWidth() && y >= 0 && y < jzVar.q.getHeight()) {
                        jzVar.o.postDelayed(jzVar.r, 250L);
                    }
                } else if (action == 1) {
                    jz jzVar2 = (jz) this.a;
                    jzVar2.o.removeCallbacks(jzVar2.r);
                }
                return false;
            case 2:
                return ((mxu) ((gli) this.a).i.fr()).a.j.equals(mxj.PHONE_LAYOUT);
            case 3:
                RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
                if (!recordSpeedSlider.k()) {
                    RecordSpeedSlider recordSpeedSlider2 = (RecordSpeedSlider) this.a;
                    if (recordSpeedSlider2.c == null || motionEvent.getAction() != 1) {
                        return false;
                    }
                    recordSpeedSlider2.c.a(view, true);
                    return false;
                }
                RecordSpeedSlider recordSpeedSlider3 = (RecordSpeedSlider) this.a;
                if (recordSpeedSlider3.c != null && motionEvent.getAction() == 0) {
                    recordSpeedSlider3.c.b(true);
                }
                while (true) {
                    if (i < recordSpeedSlider.getChildCount()) {
                        if (recordSpeedSlider.getChildAt(i).getVisibility() == 0) {
                            Rect rect = new Rect();
                            recordSpeedSlider3.getChildAt(i).getHitRect(rect);
                            if (recordSpeedSlider3.d) {
                                rect.left = Integer.MIN_VALUE;
                                rect.right = Integer.MAX_VALUE;
                            } else {
                                rect.top = Integer.MIN_VALUE;
                                rect.bottom = Integer.MAX_VALUE;
                            }
                            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                recordSpeedSlider3.h(i, true);
                            }
                        }
                        i++;
                    }
                }
                if (recordSpeedSlider3.c == null || motionEvent.getAction() != 1) {
                    return true;
                }
                recordSpeedSlider3.c.a(view, true);
                return true;
            case 4:
                jeg jegVar = ((jxa) this.a).s;
                if (jegVar == null) {
                    return false;
                }
                int action2 = motionEvent.getAction() & 255;
                if (action2 != 0) {
                    if (action2 != 2) {
                        if (action2 == 5) {
                            jegVar.e = jeg.i(motionEvent);
                            jegVar.d = true;
                            return true;
                        }
                        if (action2 != 6) {
                            return false;
                        }
                        jegVar.d = false;
                        jegVar.b.a(jegVar.f / jegVar.e);
                        return true;
                    }
                    if (jegVar.d && motionEvent.getPointerCount() > 1) {
                        float fI = jeg.i(motionEvent);
                        jegVar.f = fI;
                        float f = fI / jegVar.e;
                        jej jejVar = jegVar.b;
                        jejVar.e(f);
                        jejVar.l = true;
                    }
                }
                return true;
            case 5:
                int i2 = OptionsEntryButtonBc25Impl.i;
                view.getClass();
                motionEvent.getClass();
                ((GestureDetector) this.a).onTouchEvent(motionEvent);
                return false;
            case 6:
                ((lhk) this.a).c();
                return true;
            case 7:
                lhk lhkVar = (lhk) this.a;
                int visibility = lhkVar.o.getVisibility();
                lhkVar.c();
                return visibility == 0;
            case 8:
                int action3 = motionEvent.getAction();
                Object obj = this.a;
                if (action3 == 0) {
                    SmartsChipView smartsChipView = (SmartsChipView) obj;
                    smartsChipView.a.animate().scaleX(1.1f);
                    smartsChipView.a.animate().scaleY(1.1f);
                } else if (motionEvent.getAction() == 1) {
                    SmartsChipView smartsChipView2 = (SmartsChipView) obj;
                    smartsChipView2.a.animate().scaleX(1.0f);
                    smartsChipView2.a.animate().scaleY(1.0f);
                }
                return false;
            case 9:
                EducationToastView educationToastView = (EducationToastView) this.a;
                educationToastView.a.run();
                educationToastView.b.run();
                return false;
            case 10:
                ((GestureDetector) this.a).onTouchEvent(motionEvent);
                return true;
            case 11:
                ModeSlider modeSlider = (ModeSlider) view;
                if (!modeSlider.k()) {
                    return false;
                }
                ModeSlider modeSlider2 = (ModeSlider) this.a;
                if (modeSlider2.c != null && motionEvent.getAction() == 0) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    modeSlider2.c.b(true);
                }
                int i3 = 0;
                while (true) {
                    if (i3 < modeSlider.getChildCount()) {
                        View childAt = modeSlider.getChildAt(i3);
                        if (childAt.getVisibility() == 0) {
                            Rect rect2 = new Rect();
                            childAt.getHitRect(rect2);
                            rect2.top = Integer.MIN_VALUE;
                            rect2.bottom = Integer.MAX_VALUE;
                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                modeSlider2.h(i3, true);
                            }
                        }
                        i3++;
                    }
                }
                if (modeSlider2.c != null && motionEvent.getAction() == 1) {
                    modeSlider2.c.a(view, true);
                    if (view.getParent() == null) {
                        return true;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return true;
            case 12:
                motionEvent.getAction();
                int action4 = motionEvent.getAction();
                Object obj2 = this.a;
                if (action4 == 4 || motionEvent.getAction() == 3) {
                    nfk nfkVar = (nfk) obj2;
                    if (nfkVar.g) {
                        nfkVar.h.run();
                    }
                    return true;
                }
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                nfk nfkVar2 = (nfk) obj2;
                if (nfkVar2.g) {
                    nfkVar2.h.run();
                }
                Iterator it = nfkVar2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return true;
            case 13:
                if (motionEvent.getAction() == 1) {
                    ((nox) this.a).b.e();
                }
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    nyn nynVar = (nyn) this.a;
                    nynVar.b = false;
                    nynVar.b();
                }
                return false;
            default:
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    nyn nynVar2 = (nyn) this.a;
                    nynVar2.c = false;
                    nynVar2.b();
                }
                return false;
        }
    }

    public /* synthetic */ fuo(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
