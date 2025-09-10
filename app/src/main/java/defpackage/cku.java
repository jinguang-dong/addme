package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = cky.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(ScriptIntrinsicBLAS.UPPER, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(ScriptIntrinsicBLAS.LOWER, 67);
        sparseIntArray.append(ScriptIntrinsicBLAS.CONJ_TRANSPOSE, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(ScriptIntrinsicBLAS.TRANSPOSE, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(ScriptIntrinsicBLAS.NO_TRANSPOSE, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    private static final String A(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static /* synthetic */ String B(byte b2, String str) {
        return str + A(b2) + " undefined";
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    static void p(ckl cklVar, String str) throws NumberFormatException {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i = strSubstring.equalsIgnoreCase(GdpuLBytnYW.hxfuVRtFIUXN) ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i2 = i;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f > 0.0f && f2 > 0.0f) {
                        fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
                i2 = i;
            }
        }
        cklVar.I = str;
        cklVar.J = fAbs;
        cklVar.K = i2;
    }

    private static final int[] y(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object objEY;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = ckx.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objEY = ((ConstraintLayout) view.getParent()).eY(strTrim)) != null && (objEY instanceof Integer)) ? ((Integer) objEY).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final ckp z(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        String str;
        String str2;
        int i;
        ckp ckpVar = new ckp();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? cky.c : cky.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            cko ckoVar = new cko();
            ckpVar.g = ckoVar;
            ckr ckrVar = ckpVar.c;
            ckrVar.b = false;
            ckq ckqVar = ckpVar.d;
            ckqVar.c = false;
            cks cksVar = ckpVar.b;
            cksVar.a = false;
            ckt cktVar = ckpVar.e;
            cktVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (c.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.K));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case ImageFormat.YUV_420_888 /* 35 */:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        str2 = str3;
                        i = indexCount;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + b.get(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ckqVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ckqVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 12:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 13:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ckqVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ckqVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, ckqVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, cksVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, ckqVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(27, typedArrayObtainStyledAttributes.getInt(index, ckqVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 28:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 34:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 38:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ckpVar.a);
                        ckpVar.a = resourceId;
                        ckoVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 39:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 40:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 41:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(41, typedArrayObtainStyledAttributes.getInt(index, ckqVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 42:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(42, typedArrayObtainStyledAttributes.getInt(index, ckqVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 43:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, cksVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 44:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.d(44, true);
                        ckoVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, cktVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 45:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, cktVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 46:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, cktVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 47:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, cktVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, cktVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 49:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, cktVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 50:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, cktVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, cktVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, cktVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, cktVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(54, typedArrayObtainStyledAttributes.getInt(index, ckqVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(55, typedArrayObtainStyledAttributes.getInt(index, ckqVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, cktVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 63:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, ckqVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 64:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(64, a(typedArrayObtainStyledAttributes, index, ckrVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            ckoVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            ckoVar.c(65, cjj.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, ckrVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, cksVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(72, typedArrayObtainStyledAttributes.getInt(index, ckqVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, ckqVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(76, typedArrayObtainStyledAttributes.getInt(index, ckrVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(78, typedArrayObtainStyledAttributes.getInt(index, cksVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, ckrVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 80:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, ckqVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, ckqVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, ckrVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(83, a(typedArrayObtainStyledAttributes, index, cktVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, ckrVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        ckoVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, ckrVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 86:
                        i = indexCount;
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            ckrVar.n = resourceId2;
                            ckoVar.b(89, resourceId2);
                            if (ckrVar.n != -1) {
                                ckoVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            ckrVar.m = typedArrayObtainStyledAttributes.getString(index);
                            ckoVar.c(90, ckrVar.m);
                            if (ckrVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                ckrVar.n = resourceId3;
                                ckoVar.b(89, resourceId3);
                                ckoVar.b(88, -2);
                            } else {
                                ckoVar.b(88, -1);
                            }
                        } else {
                            ckoVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, ckrVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 87:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + b.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        ckoVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        ckoVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ckqVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        o(ckoVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i = indexCount;
                        o(ckoVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        ckoVar.b(97, typedArrayObtainStyledAttributes.getInt(index, ckqVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            ckpVar.a = typedArrayObtainStyledAttributes.getResourceId(index, ckpVar.a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        ckoVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, ckqVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            String str4 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    ckpVar.c.b = true;
                    ckpVar.d.c = true;
                    ckpVar.b.a = true;
                    ckpVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        ckq ckqVar2 = ckpVar.d;
                        ckqVar2.r = a(typedArrayObtainStyledAttributes, index2, ckqVar2.r);
                        break;
                    case 2:
                        str = str4;
                        ckq ckqVar3 = ckpVar.d;
                        ckqVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar3.K);
                        break;
                    case 3:
                        str = str4;
                        ckq ckqVar4 = ckpVar.d;
                        ckqVar4.q = a(typedArrayObtainStyledAttributes, index2, ckqVar4.q);
                        break;
                    case 4:
                        str = str4;
                        ckq ckqVar5 = ckpVar.d;
                        ckqVar5.p = a(typedArrayObtainStyledAttributes, index2, ckqVar5.p);
                        break;
                    case 5:
                        str = str4;
                        ckpVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        ckq ckqVar6 = ckpVar.d;
                        ckqVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ckqVar6.E);
                        break;
                    case 7:
                        str = str4;
                        ckq ckqVar7 = ckpVar.d;
                        ckqVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ckqVar7.F);
                        break;
                    case 8:
                        str = str4;
                        ckq ckqVar8 = ckpVar.d;
                        ckqVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar8.L);
                        break;
                    case 9:
                        str = str4;
                        ckq ckqVar9 = ckpVar.d;
                        ckqVar9.x = a(typedArrayObtainStyledAttributes, index2, ckqVar9.x);
                        break;
                    case 10:
                        str = str4;
                        ckq ckqVar10 = ckpVar.d;
                        ckqVar10.w = a(typedArrayObtainStyledAttributes, index2, ckqVar10.w);
                        break;
                    case 11:
                        str = str4;
                        ckq ckqVar11 = ckpVar.d;
                        ckqVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar11.R);
                        break;
                    case 12:
                        str = str4;
                        ckq ckqVar12 = ckpVar.d;
                        ckqVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar12.S);
                        break;
                    case 13:
                        str = str4;
                        ckq ckqVar13 = ckpVar.d;
                        ckqVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar13.O);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str = str4;
                        ckq ckqVar14 = ckpVar.d;
                        ckqVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        ckq ckqVar15 = ckpVar.d;
                        ckqVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar15.T);
                        break;
                    case 16:
                        str = str4;
                        ckq ckqVar16 = ckpVar.d;
                        ckqVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar16.P);
                        break;
                    case 17:
                        str = str4;
                        ckq ckqVar17 = ckpVar.d;
                        ckqVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ckqVar17.f);
                        break;
                    case 18:
                        str = str4;
                        ckq ckqVar18 = ckpVar.d;
                        ckqVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ckqVar18.g);
                        break;
                    case 19:
                        str = str4;
                        ckq ckqVar19 = ckpVar.d;
                        ckqVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar19.h);
                        break;
                    case 20:
                        str = str4;
                        ckq ckqVar20 = ckpVar.d;
                        ckqVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar20.y);
                        break;
                    case 21:
                        str = str4;
                        ckq ckqVar21 = ckpVar.d;
                        ckqVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ckqVar21.e);
                        break;
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        str = str4;
                        cks cksVar2 = ckpVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, cksVar2.b);
                        cksVar2.b = i5;
                        cksVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        ckq ckqVar22 = ckpVar.d;
                        ckqVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ckqVar22.d);
                        break;
                    case 24:
                        str = str4;
                        ckq ckqVar23 = ckpVar.d;
                        ckqVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar23.H);
                        break;
                    case 25:
                        str = str4;
                        ckq ckqVar24 = ckpVar.d;
                        ckqVar24.j = a(typedArrayObtainStyledAttributes, index2, ckqVar24.j);
                        break;
                    case 26:
                        str = str4;
                        ckq ckqVar25 = ckpVar.d;
                        ckqVar25.k = a(typedArrayObtainStyledAttributes, index2, ckqVar25.k);
                        break;
                    case 27:
                        str = str4;
                        ckq ckqVar26 = ckpVar.d;
                        ckqVar26.G = typedArrayObtainStyledAttributes.getInt(index2, ckqVar26.G);
                        break;
                    case 28:
                        str = str4;
                        ckq ckqVar27 = ckpVar.d;
                        ckqVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar27.I);
                        break;
                    case 29:
                        str = str4;
                        ckq ckqVar28 = ckpVar.d;
                        ckqVar28.l = a(typedArrayObtainStyledAttributes, index2, ckqVar28.l);
                        break;
                    case 30:
                        str = str4;
                        ckq ckqVar29 = ckpVar.d;
                        ckqVar29.m = a(typedArrayObtainStyledAttributes, index2, ckqVar29.m);
                        break;
                    case 31:
                        str = str4;
                        ckq ckqVar30 = ckpVar.d;
                        ckqVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar30.M);
                        break;
                    case 32:
                        str = str4;
                        ckq ckqVar31 = ckpVar.d;
                        ckqVar31.u = a(typedArrayObtainStyledAttributes, index2, ckqVar31.u);
                        break;
                    case 33:
                        str = str4;
                        ckq ckqVar32 = ckpVar.d;
                        ckqVar32.v = a(typedArrayObtainStyledAttributes, index2, ckqVar32.v);
                        break;
                    case 34:
                        str = str4;
                        ckq ckqVar33 = ckpVar.d;
                        ckqVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar33.J);
                        break;
                    case ImageFormat.YUV_420_888 /* 35 */:
                        str = str4;
                        ckq ckqVar34 = ckpVar.d;
                        ckqVar34.o = a(typedArrayObtainStyledAttributes, index2, ckqVar34.o);
                        break;
                    case 36:
                        str = str4;
                        ckq ckqVar35 = ckpVar.d;
                        ckqVar35.n = a(typedArrayObtainStyledAttributes, index2, ckqVar35.n);
                        break;
                    case 37:
                        str = str4;
                        ckq ckqVar36 = ckpVar.d;
                        ckqVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar36.z);
                        break;
                    case 38:
                        str = str4;
                        ckpVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, ckpVar.a);
                        break;
                    case 39:
                        str = str4;
                        ckq ckqVar37 = ckpVar.d;
                        ckqVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar37.W);
                        break;
                    case 40:
                        str = str4;
                        ckq ckqVar38 = ckpVar.d;
                        ckqVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar38.V);
                        break;
                    case 41:
                        str = str4;
                        ckq ckqVar39 = ckpVar.d;
                        ckqVar39.X = typedArrayObtainStyledAttributes.getInt(index2, ckqVar39.X);
                        break;
                    case 42:
                        str = str4;
                        ckq ckqVar40 = ckpVar.d;
                        ckqVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, ckqVar40.Y);
                        break;
                    case 43:
                        str = str4;
                        cks cksVar3 = ckpVar.b;
                        cksVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, cksVar3.d);
                        break;
                    case 44:
                        str = str4;
                        ckt cktVar2 = ckpVar.e;
                        cktVar2.n = true;
                        cktVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, cktVar2.o);
                        break;
                    case 45:
                        str = str4;
                        ckt cktVar3 = ckpVar.e;
                        cktVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, cktVar3.d);
                        break;
                    case 46:
                        str = str4;
                        ckt cktVar4 = ckpVar.e;
                        cktVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, cktVar4.e);
                        break;
                    case 47:
                        str = str4;
                        ckt cktVar5 = ckpVar.e;
                        cktVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, cktVar5.f);
                        break;
                    case 48:
                        str = str4;
                        ckt cktVar6 = ckpVar.e;
                        cktVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, cktVar6.g);
                        break;
                    case 49:
                        str = str4;
                        ckt cktVar7 = ckpVar.e;
                        cktVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, cktVar7.h);
                        break;
                    case 50:
                        str = str4;
                        ckt cktVar8 = ckpVar.e;
                        cktVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, cktVar8.i);
                        break;
                    case 51:
                        str = str4;
                        ckt cktVar9 = ckpVar.e;
                        cktVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, cktVar9.k);
                        break;
                    case 52:
                        str = str4;
                        ckt cktVar10 = ckpVar.e;
                        cktVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, cktVar10.l);
                        break;
                    case 53:
                        str = str4;
                        ckt cktVar11 = ckpVar.e;
                        cktVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, cktVar11.m);
                        break;
                    case 54:
                        str = str4;
                        ckq ckqVar41 = ckpVar.d;
                        ckqVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, ckqVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        ckq ckqVar42 = ckpVar.d;
                        ckqVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, ckqVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        ckq ckqVar43 = ckpVar.d;
                        ckqVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        ckq ckqVar44 = ckpVar.d;
                        ckqVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        ckq ckqVar45 = ckpVar.d;
                        ckqVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        ckq ckqVar46 = ckpVar.d;
                        ckqVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        ckt cktVar12 = ckpVar.e;
                        cktVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, cktVar12.c);
                        break;
                    case 61:
                        str = str4;
                        ckq ckqVar47 = ckpVar.d;
                        ckqVar47.B = a(typedArrayObtainStyledAttributes, index2, ckqVar47.B);
                        break;
                    case 62:
                        str = str4;
                        ckq ckqVar48 = ckpVar.d;
                        ckqVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar48.C);
                        break;
                    case 63:
                        str = str4;
                        ckq ckqVar49 = ckpVar.d;
                        ckqVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, ckqVar49.D);
                        break;
                    case 64:
                        str = str4;
                        ckr ckrVar2 = ckpVar.c;
                        ckrVar2.c = a(typedArrayObtainStyledAttributes, index2, ckrVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            ckpVar.c.e = cjj.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            ckpVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        str = str4;
                        ckpVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        ckr ckrVar3 = ckpVar.c;
                        ckrVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, ckrVar3.j);
                        break;
                    case 68:
                        str = str4;
                        cks cksVar4 = ckpVar.b;
                        cksVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, cksVar4.e);
                        break;
                    case 69:
                        str = str4;
                        ckpVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        ckpVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        ckq ckqVar50 = ckpVar.d;
                        ckqVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, ckqVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        ckq ckqVar51 = ckpVar.d;
                        ckqVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        ckpVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        ckq ckqVar52 = ckpVar.d;
                        ckqVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, ckqVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        ckr ckrVar4 = ckpVar.c;
                        ckrVar4.f = typedArrayObtainStyledAttributes.getInt(index2, ckrVar4.f);
                        break;
                    case 77:
                        str = str4;
                        ckpVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        cks cksVar5 = ckpVar.b;
                        cksVar5.c = typedArrayObtainStyledAttributes.getInt(index2, cksVar5.c);
                        break;
                    case 79:
                        str = str4;
                        ckr ckrVar5 = ckpVar.c;
                        ckrVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, ckrVar5.h);
                        break;
                    case 80:
                        str = str4;
                        ckq ckqVar53 = ckpVar.d;
                        ckqVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, ckqVar53.an);
                        break;
                    case 81:
                        str = str4;
                        ckq ckqVar54 = ckpVar.d;
                        ckqVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, ckqVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        ckr ckrVar6 = ckpVar.c;
                        ckrVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, ckrVar6.d);
                        break;
                    case 83:
                        str = str4;
                        ckt cktVar13 = ckpVar.e;
                        cktVar13.j = a(typedArrayObtainStyledAttributes, index2, cktVar13.j);
                        break;
                    case 84:
                        str = str4;
                        ckr ckrVar7 = ckpVar.c;
                        ckrVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, ckrVar7.l);
                        break;
                    case 85:
                        str = str4;
                        ckr ckrVar8 = ckpVar.c;
                        ckrVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, ckrVar8.k);
                        break;
                    case 86:
                        str = str4;
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            ckpVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            ckr ckrVar9 = ckpVar.c;
                            ckrVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (ckrVar9.m.indexOf("/") > 0) {
                                ckrVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, ckpVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        ckq ckqVar55 = ckpVar.d;
                        ckqVar55.s = a(typedArrayObtainStyledAttributes, index2, ckqVar55.s);
                        str = str4;
                        break;
                    case 92:
                        ckq ckqVar56 = ckpVar.d;
                        ckqVar56.t = a(typedArrayObtainStyledAttributes, index2, ckqVar56.t);
                        str = str4;
                        break;
                    case 93:
                        ckq ckqVar57 = ckpVar.d;
                        ckqVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar57.N);
                        str = str4;
                        break;
                    case 94:
                        ckq ckqVar58 = ckpVar.d;
                        ckqVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ckqVar58.U);
                        str = str4;
                        break;
                    case 95:
                        o(ckpVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case 96:
                        o(ckpVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        ckq ckqVar59 = ckpVar.d;
                        ckqVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, ckqVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            ckq ckqVar60 = ckpVar.d;
            if (ckqVar60.al != null) {
                ckqVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return ckpVar;
    }

    public final ckp b(int i) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ckp());
        }
        return (ckp) map.get(numValueOf);
    }

    public final void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void d(int i, int i2) {
        if (i2 == 0) {
            x(i, 0, 1, 0, 2);
        } else {
            x(i, i2, 2, i2, 1);
        }
    }

    public final void e(int i) {
        this.e.remove(Integer.valueOf(i));
    }

    public final void f(int i, int i2) {
        ckp ckpVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (ckpVar = (ckp) map.get(numValueOf)) == null) {
            return;
        }
        if (i2 == 3) {
            ckq ckqVar = ckpVar.d;
            ckqVar.o = -1;
            ckqVar.n = -1;
            ckqVar.J = 0;
            ckqVar.P = Integer.MIN_VALUE;
            return;
        }
        if (i2 == 4) {
            ckq ckqVar2 = ckpVar.d;
            ckqVar2.p = -1;
            ckqVar2.q = -1;
            ckqVar2.K = 0;
            ckqVar2.R = Integer.MIN_VALUE;
            return;
        }
        if (i2 == 5) {
            ckq ckqVar3 = ckpVar.d;
            ckqVar3.r = -1;
            ckqVar3.s = -1;
            ckqVar3.t = -1;
            ckqVar3.N = 0;
            ckqVar3.U = Integer.MIN_VALUE;
            return;
        }
        ckq ckqVar4 = ckpVar.d;
        if (i2 != 6) {
            ckqVar4.w = -1;
            ckqVar4.x = -1;
            ckqVar4.L = 0;
            ckqVar4.S = Integer.MIN_VALUE;
            return;
        }
        ckqVar4.u = -1;
        ckqVar4.v = -1;
        ckqVar4.M = 0;
        ckqVar4.T = Integer.MIN_VALUE;
    }

    public final void g(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        cku ckuVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = ckuVar.e;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ckl cklVar = (ckl) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new ckp());
            }
            ckp ckpVar = (ckp) map3.get(numValueOf);
            if (ckpVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = ckuVar.d;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    cki ckiVar = (cki) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new cki(ckiVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new cki(ckiVar, cls.getMethod(mn.g(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                ckpVar.f = map5;
                ckpVar.a = id;
                int i4 = cklVar.e;
                ckq ckqVar = ckpVar.d;
                ckqVar.j = i4;
                ckqVar.k = cklVar.f;
                ckqVar.l = cklVar.g;
                ckqVar.m = cklVar.h;
                ckqVar.n = cklVar.i;
                ckqVar.o = cklVar.j;
                ckqVar.p = cklVar.k;
                ckqVar.q = cklVar.l;
                ckqVar.r = cklVar.m;
                ckqVar.s = cklVar.n;
                ckqVar.t = cklVar.o;
                ckqVar.u = cklVar.s;
                ckqVar.v = cklVar.t;
                ckqVar.w = cklVar.u;
                ckqVar.x = cklVar.v;
                ckqVar.y = cklVar.G;
                ckqVar.z = cklVar.H;
                ckqVar.A = cklVar.I;
                ckqVar.B = cklVar.p;
                ckqVar.C = cklVar.q;
                ckqVar.D = cklVar.r;
                ckqVar.E = cklVar.X;
                ckqVar.F = cklVar.Y;
                ckqVar.G = cklVar.Z;
                ckqVar.h = cklVar.c;
                ckqVar.f = cklVar.a;
                ckqVar.g = cklVar.b;
                ckqVar.d = cklVar.width;
                ckqVar.e = cklVar.height;
                ckqVar.H = cklVar.leftMargin;
                ckqVar.I = cklVar.rightMargin;
                ckqVar.J = cklVar.topMargin;
                ckqVar.K = cklVar.bottomMargin;
                ckqVar.N = cklVar.D;
                ckqVar.V = cklVar.M;
                ckqVar.W = cklVar.L;
                ckqVar.Y = cklVar.O;
                ckqVar.X = cklVar.N;
                ckqVar.an = cklVar.aa;
                ckqVar.ao = cklVar.ab;
                ckqVar.Z = cklVar.P;
                ckqVar.aa = cklVar.Q;
                ckqVar.ab = cklVar.T;
                ckqVar.ac = cklVar.U;
                ckqVar.ad = cklVar.R;
                ckqVar.ae = cklVar.S;
                ckqVar.af = cklVar.V;
                ckqVar.ag = cklVar.W;
                ckqVar.am = cklVar.ac;
                ckqVar.P = cklVar.x;
                ckqVar.R = cklVar.z;
                ckqVar.O = cklVar.w;
                ckqVar.Q = cklVar.y;
                ckqVar.T = cklVar.A;
                ckqVar.S = cklVar.B;
                ckqVar.U = cklVar.C;
                ckqVar.aq = cklVar.ad;
                ckqVar.L = cklVar.getMarginEnd();
                ckqVar.M = cklVar.getMarginStart();
                cks cksVar = ckpVar.b;
                cksVar.b = childAt.getVisibility();
                cksVar.d = childAt.getAlpha();
                ckt cktVar = ckpVar.e;
                cktVar.c = childAt.getRotation();
                cktVar.d = childAt.getRotationX();
                cktVar.e = childAt.getRotationY();
                cktVar.f = childAt.getScaleX();
                cktVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    cktVar.h = pivotX;
                    cktVar.i = pivotY;
                }
                cktVar.k = childAt.getTranslationX();
                cktVar.l = childAt.getTranslationY();
                cktVar.m = childAt.getTranslationZ();
                if (cktVar.n) {
                    cktVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    ckqVar.ap = barrier.b.b;
                    ckqVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    ckqVar.ah = barrier.a;
                    ckqVar.ai = barrier.b.c;
                }
            }
            i2++;
            ckuVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void h(Context context, int i) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void i(int i, int i2, int i3, int i4) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ckp());
        }
        ckp ckpVar = (ckp) map.get(numValueOf);
        if (ckpVar == null) {
            return;
        }
        byte b2 = (byte) i4;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    ckq ckqVar = ckpVar.d;
                    ckqVar.j = i3;
                    ckqVar.k = -1;
                    return;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(B(b2, "left to "));
                    }
                    ckq ckqVar2 = ckpVar.d;
                    ckqVar2.k = i3;
                    ckqVar2.j = -1;
                    return;
                }
            case 2:
                if (i4 == 1) {
                    ckq ckqVar3 = ckpVar.d;
                    ckqVar3.l = i3;
                    ckqVar3.m = -1;
                    return;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar4 = ckpVar.d;
                    ckqVar4.m = i3;
                    ckqVar4.l = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    ckq ckqVar5 = ckpVar.d;
                    ckqVar5.n = i3;
                    ckqVar5.o = -1;
                    ckqVar5.r = -1;
                    ckqVar5.s = -1;
                    ckqVar5.t = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException(B(b2, "right to "));
                }
                ckq ckqVar6 = ckpVar.d;
                ckqVar6.o = i3;
                ckqVar6.n = -1;
                ckqVar6.r = -1;
                ckqVar6.s = -1;
                ckqVar6.t = -1;
                return;
            case 4:
                if (i4 == 4) {
                    ckq ckqVar7 = ckpVar.d;
                    ckqVar7.q = i3;
                    ckqVar7.p = -1;
                    ckqVar7.r = -1;
                    ckqVar7.s = -1;
                    ckqVar7.t = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException(B(b2, "right to "));
                }
                ckq ckqVar8 = ckpVar.d;
                ckqVar8.p = i3;
                ckqVar8.q = -1;
                ckqVar8.r = -1;
                ckqVar8.s = -1;
                ckqVar8.t = -1;
                return;
            case 5:
                if (i4 == 5) {
                    ckq ckqVar9 = ckpVar.d;
                    ckqVar9.r = i3;
                    ckqVar9.q = -1;
                    ckqVar9.p = -1;
                    ckqVar9.n = -1;
                    ckqVar9.o = -1;
                    return;
                }
                if (i4 == 3) {
                    ckq ckqVar10 = ckpVar.d;
                    ckqVar10.s = i3;
                    ckqVar10.q = -1;
                    ckqVar10.p = -1;
                    ckqVar10.n = -1;
                    ckqVar10.o = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException(B(b2, "right to "));
                }
                ckq ckqVar11 = ckpVar.d;
                ckqVar11.t = i3;
                ckqVar11.q = -1;
                ckqVar11.p = -1;
                ckqVar11.n = -1;
                ckqVar11.o = -1;
                return;
            case 6:
                if (i4 == 6) {
                    ckq ckqVar12 = ckpVar.d;
                    ckqVar12.v = i3;
                    ckqVar12.u = -1;
                    return;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar13 = ckpVar.d;
                    ckqVar13.u = i3;
                    ckqVar13.v = -1;
                    return;
                }
            default:
                if (i4 == 7) {
                    ckq ckqVar14 = ckpVar.d;
                    ckqVar14.x = i3;
                    ckqVar14.w = -1;
                    return;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar15 = ckpVar.d;
                    ckqVar15.w = i3;
                    ckqVar15.x = -1;
                    return;
                }
        }
    }

    public final void j(int i, int i2, int i3, int i4, int i5) {
        ckq ckqVar;
        ckq ckqVar2;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ckp());
        }
        ckp ckpVar = (ckp) map.get(numValueOf);
        if (ckpVar == null) {
            return;
        }
        byte b2 = (byte) i4;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    ckq ckqVar3 = ckpVar.d;
                    ckqVar3.j = i3;
                    ckqVar3.k = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(B(b2, "Left to "));
                    }
                    ckq ckqVar4 = ckpVar.d;
                    ckqVar4.k = i3;
                    ckqVar4.j = -1;
                }
                ckpVar.d.H = i5;
                return;
            case 2:
                if (i4 == 1) {
                    ckq ckqVar5 = ckpVar.d;
                    ckqVar5.l = i3;
                    ckqVar5.m = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar6 = ckpVar.d;
                    ckqVar6.m = i3;
                    ckqVar6.l = -1;
                }
                ckpVar.d.I = i5;
                return;
            case 3:
                if (i4 == 3) {
                    ckqVar = ckpVar.d;
                    ckqVar.n = i3;
                    ckqVar.o = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckqVar = ckpVar.d;
                    ckqVar.o = i3;
                    ckqVar.n = -1;
                }
                ckqVar.r = -1;
                ckqVar.s = -1;
                ckqVar.t = -1;
                ckpVar.d.J = i5;
                return;
            case 4:
                if (i4 == 4) {
                    ckqVar2 = ckpVar.d;
                    ckqVar2.q = i3;
                    ckqVar2.p = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckqVar2 = ckpVar.d;
                    ckqVar2.p = i3;
                    ckqVar2.q = -1;
                }
                ckqVar2.r = -1;
                ckqVar2.s = -1;
                ckqVar2.t = -1;
                ckpVar.d.K = i5;
                return;
            case 5:
                if (i4 == 5) {
                    ckq ckqVar7 = ckpVar.d;
                    ckqVar7.r = i3;
                    ckqVar7.q = -1;
                    ckqVar7.p = -1;
                    ckqVar7.n = -1;
                    ckqVar7.o = -1;
                    return;
                }
                if (i4 == 3) {
                    ckq ckqVar8 = ckpVar.d;
                    ckqVar8.s = i3;
                    ckqVar8.q = -1;
                    ckqVar8.p = -1;
                    ckqVar8.n = -1;
                    ckqVar8.o = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException(B(b2, "right to "));
                }
                ckq ckqVar9 = ckpVar.d;
                ckqVar9.t = i3;
                ckqVar9.q = -1;
                ckqVar9.p = -1;
                ckqVar9.n = -1;
                ckqVar9.o = -1;
                return;
            case 6:
                if (i4 == 6) {
                    ckq ckqVar10 = ckpVar.d;
                    ckqVar10.v = i3;
                    ckqVar10.u = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar11 = ckpVar.d;
                    ckqVar11.u = i3;
                    ckqVar11.v = -1;
                }
                ckpVar.d.M = i5;
                return;
            case 7:
                if (i4 == 7) {
                    ckq ckqVar12 = ckpVar.d;
                    ckqVar12.x = i3;
                    ckqVar12.w = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(B(b2, "right to "));
                    }
                    ckq ckqVar13 = ckpVar.d;
                    ckqVar13.w = i3;
                    ckqVar13.x = -1;
                }
                ckpVar.d.L = i5;
                return;
            default:
                throw new IllegalArgumentException(A(i2) + " to " + A(i4) + " unknown");
        }
    }

    public final void k(int i, int i2) {
        b(i).d.e = i2;
    }

    public final void l(int i, int i2) {
        b(i).d.d = i2;
    }

    public final void m(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ckp ckpVarZ = z(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        ckpVarZ.d.b = true;
                    }
                    this.e.put(Integer.valueOf(ckpVarZ.a), ckpVarZ);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.bv(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.bv(i, "Error parsing resource: "), e2);
        }
    }

    public final void q(int i) {
        cku ckuVar;
        int i2;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            ckp ckpVar = (ckp) map.get(numValueOf);
            if (ckpVar == null) {
                return;
            }
            ckq ckqVar = ckpVar.d;
            int i3 = ckqVar.o;
            int i4 = ckqVar.p;
            if (i3 == -1) {
                if (i4 != -1) {
                    i2 = -1;
                }
                ckuVar = this;
            } else {
                i2 = i3;
            }
            if (i2 == -1 || i4 == -1) {
                int i5 = ckqVar.q;
                if (i5 != -1) {
                    j(i2, 4, i5, 4, 0);
                } else {
                    int i6 = ckqVar.n;
                    if (i6 != -1) {
                        ckuVar = this;
                        ckuVar.j(i4, 3, i6, 3, 0);
                    }
                }
                ckuVar = this;
            } else {
                int i7 = i2;
                ckuVar = this;
                ckuVar.j(i7, 4, i4, 3, 0);
                ckuVar.j(i4, 3, i7, 4, 0);
            }
        } else {
            ckuVar = this;
        }
        ckuVar.f(i, 3);
        ckuVar.f(i, 4);
    }

    public final void r(int i, int i2) {
        b(i).d.f = i2;
        b(i).d.g = -1;
        b(i).d.h = -1.0f;
    }

    public final void s(int i, int i2) {
        b(i).d.g = i2;
        b(i).d.f = -1;
        b(i).d.h = -1.0f;
    }

    public final void t(int i, float f) {
        b(i).e.c = f;
    }

    public final void u(int i, float f) {
        b(i).e.k = f;
    }

    public final void v(int i, float f) {
        b(i).e.l = f;
    }

    public final void x(int i, int i2, int i3, int i4, int i5) {
        if (i3 != 1) {
            i3 = 2;
        }
        j(i, 1, i2, i3, 0);
        j(i, 2, i4, i5, 0);
        ckp ckpVar = (ckp) this.e.get(Integer.valueOf(i));
        if (ckpVar != null) {
            ckpVar.d.y = 0.5f;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            Method dump skipped, instructions count: 2200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cku.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void w(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String resourceEntryName;
        HashSet hashSet;
        HashMap map;
        int i;
        HashMap map2;
        String strConcat;
        int i2;
        int i3;
        int i4;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = this.e;
        HashSet hashSet2 = new HashSet(map3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", VnmwoBe.HtbHHgDZg.concat(String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap map4 = this.e;
                    if (map4.containsKey(numValueOf)) {
                        hashSet2.remove(numValueOf);
                        ckp ckpVar = (ckp) map4.get(numValueOf);
                        if (ckpVar != null) {
                            if (childAt instanceof Barrier) {
                                ckq ckqVar = ckpVar.d;
                                ckqVar.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = ckqVar.ah;
                                barrier.c(ckqVar.ai);
                                barrier.b.b = ckqVar.ap;
                                int[] iArr = ckqVar.ak;
                                if (iArr != null) {
                                    barrier.g(iArr);
                                } else {
                                    String str = ckqVar.al;
                                    if (str != null) {
                                        ckqVar.ak = y(barrier, str);
                                        barrier.g(ckqVar.ak);
                                    }
                                }
                            }
                            ckl cklVar = (ckl) childAt.getLayoutParams();
                            cklVar.a();
                            ckpVar.a(cklVar);
                            HashMap map5 = ckpVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map5.keySet()) {
                                cki ckiVar = (cki) map5.get(str2);
                                HashSet hashSet3 = hashSet2;
                                if (ckiVar.a) {
                                    map2 = map3;
                                    strConcat = str2;
                                } else {
                                    map2 = map3;
                                    strConcat = "set".concat(String.valueOf(str2));
                                }
                                try {
                                    i3 = ckiVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ckiVar.c));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(ckiVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ckiVar.g));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strConcat, Drawable.class);
                                        i2 = i5;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(ckiVar.g);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + cdVQ.fAVSfP + strConcat, e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        }
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                    case 4:
                                        cls.getMethod(strConcat, CharSequence.class).invoke(childAt, ckiVar.e);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                    case 5:
                                        cls.getMethod(strConcat, Boolean.TYPE).invoke(childAt, Boolean.valueOf(ckiVar.f));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                    case 6:
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(ckiVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                    case 7:
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ckiVar.c));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                    default:
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                }
                            }
                            hashSet = hashSet2;
                            map = map3;
                            i = i5;
                            childAt.setLayoutParams(cklVar);
                            cks cksVar = ckpVar.b;
                            if (cksVar.c == 0) {
                                childAt.setVisibility(cksVar.b);
                            }
                            childAt.setAlpha(cksVar.d);
                            ckt cktVar = ckpVar.e;
                            childAt.setRotation(cktVar.c);
                            childAt.setRotationX(cktVar.d);
                            childAt.setRotationY(cktVar.e);
                            childAt.setScaleX(cktVar.f);
                            childAt.setScaleY(cktVar.g);
                            if (cktVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(cktVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(cktVar.h)) {
                                    childAt.setPivotX(cktVar.h);
                                }
                                if (!Float.isNaN(cktVar.i)) {
                                    childAt.setPivotY(cktVar.i);
                                }
                            }
                            childAt.setTranslationX(cktVar.k);
                            childAt.setTranslationY(cktVar.l);
                            childAt.setTranslationZ(cktVar.m);
                            if (cktVar.n) {
                                childAt.setElevation(cktVar.o);
                            }
                        }
                    }
                }
                i5 = i + 1;
                hashSet2 = hashSet;
                map3 = map;
            }
            hashSet = hashSet2;
            map = map3;
            i = i5;
            i5 = i + 1;
            hashSet2 = hashSet;
            map3 = map;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ckp ckpVar2 = (ckp) this.e.get(num);
            if (ckpVar2 != null) {
                ckq ckqVar2 = ckpVar2.d;
                if (ckqVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = ckqVar2.ak;
                    if (iArr2 != null) {
                        barrier2.g(iArr2);
                    } else {
                        String str3 = ckqVar2.al;
                        if (str3 != null) {
                            ckqVar2.ak = y(barrier2, str3);
                            barrier2.g(ckqVar2.ak);
                        }
                    }
                    barrier2.a = ckqVar2.ah;
                    barrier2.c(ckqVar2.ai);
                    ckl cklVarDQ = constraintLayout.generateDefaultLayoutParams();
                    barrier2.h();
                    ckpVar2.a(cklVarDQ);
                    constraintLayout.addView(barrier2, cklVarDQ);
                }
                if (ckqVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ckl cklVarDQ2 = constraintLayout.generateDefaultLayoutParams();
                    ckpVar2.a(cklVarDQ2);
                    constraintLayout.addView(guideline, cklVarDQ2);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof ckj) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void o(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cku.o(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }
}
