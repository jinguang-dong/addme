package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvx {
    public static final dvx a = cij.s(new LinkedHashMap());
    public final Map b;

    public dvx(dvx dvxVar) {
        dvxVar.getClass();
        this.b = new HashMap(dvxVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final dvx a(byte[] bArr) {
        Object utf;
        bArr.getClass();
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf2 = objectInputStream.readUTF();
                        utf2.getClass();
                        linkedHashMap.put(utf2, objectInputStream.readObject());
                    }
                    ujk.e(objectInputStream, null);
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new IllegalStateException(a.bv(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new IllegalStateException(a.bv(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        if (b == 0) {
                            utf = null;
                        } else if (b == 1) {
                            utf = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else if (b == 8) {
                            int i5 = dataInputStream.readInt();
                            Boolean[] boolArr = new Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                boolArr[i6] = Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            utf = (Serializable) boolArr;
                        } else if (b == 9) {
                            int i7 = dataInputStream.readInt();
                            Byte[] bArr3 = new Byte[i7];
                            for (int i8 = 0; i8 < i7; i8++) {
                                bArr3[i8] = Byte.valueOf(dataInputStream.readByte());
                            }
                            utf = (Serializable) bArr3;
                        } else if (b == 10) {
                            int i9 = dataInputStream.readInt();
                            Integer[] numArr = new Integer[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                            }
                            utf = (Serializable) numArr;
                        } else if (b == 11) {
                            int i11 = dataInputStream.readInt();
                            Long[] lArr = new Long[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                lArr[i12] = Long.valueOf(dataInputStream.readLong());
                            }
                            utf = (Serializable) lArr;
                        } else if (b == 12) {
                            int i13 = dataInputStream.readInt();
                            Float[] fArr = new Float[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                fArr[i14] = Float.valueOf(dataInputStream.readFloat());
                            }
                            utf = (Serializable) fArr;
                        } else if (b == 13) {
                            int i15 = dataInputStream.readInt();
                            Double[] dArr = new Double[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                dArr[i16] = Double.valueOf(dataInputStream.readDouble());
                            }
                            utf = (Serializable) dArr;
                        } else {
                            if (b != 14) {
                                throw new IllegalStateException(a.bv(b, "Unsupported type "));
                            }
                            int i17 = dataInputStream.readInt();
                            String[] strArr = new String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                String utf3 = dataInputStream.readUTF();
                                if (true == a.ao(utf3, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    utf3 = null;
                                }
                                strArr[i18] = utf3;
                            }
                            utf = (Serializable) strArr;
                        }
                        String utf4 = dataInputStream.readUTF();
                        utf4.getClass();
                        linkedHashMap.put(utf4, utf);
                    }
                    ujk.e(dataInputStream, null);
                } finally {
                }
            }
        } catch (IOException e) {
            String str = dvy.a;
            dwj.b();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = dvy.a;
            dwj.b();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new dvx(linkedHashMap);
    }

    public final String b(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final boolean d(String str) {
        Object obj = this.b.get(str);
        return ((Boolean) (true == (obj instanceof Boolean) ? obj : false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L65
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r2 = defpackage.a.ao(r2, r3)
            if (r2 != 0) goto L16
            goto L65
        L16:
            dvx r8 = (defpackage.dvx) r8
            java.util.Map r7 = r7.b
            java.util.Map r8 = r8.b
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = defpackage.a.ao(r2, r3)
            if (r3 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L48
            goto L61
        L48:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5a
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5a
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.rnt.ad(r5, r3)
            goto L5e
        L5a:
            boolean r3 = defpackage.a.ao(r4, r3)
        L5e:
            if (r3 != 0) goto L2f
            goto L63
        L61:
            if (r4 == r3) goto L2f
        L63:
            return r1
        L64:
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + ske.ca(this.b.entrySet(), null, null, null, aap.q, 31) + "}";
    }

    public dvx(Map map) {
        this.b = new HashMap(map);
    }
}
