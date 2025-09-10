package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class irl implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ irl(hie hieVar, hiq hiqVar, int i) {
        this.c = i;
        this.b = hieVar;
        this.a = hiqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) throws Resources.NotFoundException {
        if (this.c == 0) {
            if (((WindowManager.LayoutParams) ((ViewGroup) ((View) this.b).getParent()).getLayoutParams()) != null) {
                Object obj = this.a;
                motionEvent.setLocation(r6.x + motionEvent.getX(), r6.y + motionEvent.getY());
                ((irs) obj).l.getRootView().dispatchTouchEvent(motionEvent);
            }
            return true;
        }
        hie hieVar = (hie) this.b;
        if (hieVar.k.getVisibility() != 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            hieVar.k.m(view, motionEvent);
            hieVar.l(true, true);
            hieVar.i(true);
            return true;
        }
        Object obj2 = this.a;
        if (motionEvent.getAction() == 1) {
            hhy hhyVar = (hhy) view.getTag();
            hhyVar.getClass();
            ((him) obj2).d(hhyVar);
            ((hhv) hieVar.m.dL()).equals(hhv.DUAL_INDEPENDENT);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            float[] fArrM = hieVar.k.m(view, motionEvent);
            float f = fArrM[0];
            Object tag = view.getTag();
            tag.getClass();
            him himVar = (him) obj2;
            himVar.f(f, (hhy) tag);
            if (fArrM[1] != -1.0f) {
                Object tag2 = view.getTag();
                tag2.getClass();
                float f2 = fArrM[1];
                hhy hhyVar2 = hhy.BRIGHTNESS;
                if (((hhy) tag2).equals(hhyVar2)) {
                    hhyVar2 = hhy.SHADOW;
                }
                himVar.f(f2, hhyVar2);
            }
        }
        return true;
    }

    public /* synthetic */ irl(irs irsVar, View view, int i) {
        this.c = i;
        this.a = irsVar;
        this.b = view;
    }
}
