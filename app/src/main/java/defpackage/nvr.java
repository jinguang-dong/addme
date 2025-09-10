package defpackage;

import android.util.SparseArray;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvr {
    public static final int[] a;
    private static final SparseArray b;

    public static boolean a(int[] iArr, int i) {
        return Arrays.binarySearch(iArr, i) >= 0;
    }

    public static boolean b(int i) {
        return a(a, i);
    }

    private static int[] c() throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            try {
                Class.forName((String) sparseArray.valueAt(i2));
                arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
            i2++;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i < size) {
            iArr[i3] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i3++;
        }
        Arrays.sort(iArr);
        return iArr;
    }

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.append(0, "com.google.android.camera.experimental2015.ExperimentalKeys");
        sparseArray.append(1, "com.google.android.camera.experimental2016.ExperimentalKeys");
        sparseArray.append(2, "com.google.android.camera.experimental2017.ExperimentalKeys");
        sparseArray.append(3, "com.google.android.camera.experimental2018.ExperimentalKeys");
        sparseArray.append(4, "com.google.android.camera.experimental2019.ExperimentalKeys");
        sparseArray.append(5, "com.google.android.camera.experimental2020_midyear.ExperimentalKeys");
        sparseArray.append(6, "com.google.android.camera.experimental2020.ExperimentalKeys");
        sparseArray.append(7, "com.google.android.camera.experimental2021.ExperimentalKeys");
        sparseArray.append(8, "com.google.android.camera.experimental2022.ExperimentalKeys");
        sparseArray.append(9, "com.google.android.camera.experimental2022_system.ExperimentalKeys");
        sparseArray.append(10, LmJPKwPBa.NvkqTPRSYJ);
        sparseArray.append(11, "com.google.android.camera.experimental2024.ExperimentalKeys");
        sparseArray.append(12, "com.google.android.camera.experimental2024_system.ExperimentalMultiResolutionImageReaderExtensions");
        sparseArray.append(13, "com.google.android.camera.experimental2025.ExperimentalKeys");
        a = c();
    }
}
