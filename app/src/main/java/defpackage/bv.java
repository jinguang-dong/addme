package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bv implements LayoutInflater.Factory2 {
    public final ch a;

    public bv(ch chVar) {
        this.a = chVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        cn cnVarJ;
        if (bs.class.getName().equals(str)) {
            return new bs(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ag.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = bt.a;
                try {
                    if (bm.class.isAssignableFrom(bt.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.bB(attributeValue, attributeSet, OPuAVreQM.UztywEfcuVxjeg));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        bm bmVarD = resourceId != -1 ? this.a.d(resourceId) : null;
                        if (bmVarD == null && string != null) {
                            bmVarD = this.a.e(string);
                        }
                        if (bmVarD == null && id != -1) {
                            bmVarD = this.a.d(id);
                        }
                        if (bmVarD == null) {
                            ch chVar = this.a;
                            bt btVarH = chVar.h();
                            context.getClassLoader();
                            bm bmVarB = btVarH.b(attributeValue);
                            bmVarB.u = true;
                            bmVarB.E = resourceId != 0 ? resourceId : id;
                            bmVarB.F = id;
                            bmVarB.G = string;
                            bmVarB.v = true;
                            bmVarB.A = chVar;
                            bmVarB.B = chVar.m;
                            bmVarB.onInflate(chVar.m.c, attributeSet, bmVarB.g);
                            cnVarJ = chVar.i(bmVarB);
                            if (ch.X(2)) {
                                Objects.toString(bmVarB);
                                Integer.toHexString(resourceId);
                            }
                            bmVarD = bmVarB;
                        } else {
                            if (bmVarD.v) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            bmVarD.v = true;
                            ch chVar2 = this.a;
                            bmVarD.A = chVar2;
                            bmVarD.B = chVar2.m;
                            bmVarD.onInflate(chVar2.m.c, attributeSet, bmVarD.g);
                            cnVarJ = chVar2.j(bmVarD);
                            if (ch.X(2)) {
                                Objects.toString(bmVarD);
                                Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = cui.a;
                        bmVarD.getClass();
                        cuj cujVar = new cuj(bmVarD, viewGroup);
                        cui.d(cujVar);
                        cuh cuhVarB = cui.b(bmVarD);
                        if (cuhVarB.b.contains(cug.d) && cui.e(cuhVarB, bmVarD.getClass(), cujVar.getClass())) {
                            cui.c(cuhVarB, cujVar);
                        }
                        bmVarD.O = viewGroup;
                        cnVarJ.d();
                        cnVarJ.c();
                        View view2 = bmVarD.P;
                        if (view2 == null) {
                            throw new IllegalStateException(a.bw(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (bmVarD.P.getTag() == null) {
                            bmVarD.P.setTag(string);
                        }
                        bmVarD.P.addOnAttachStateChangeListener(new iuw(this, cnVarJ, 1));
                        return bmVarD.P;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
