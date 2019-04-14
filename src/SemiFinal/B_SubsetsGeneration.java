package SemiFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author anarmammad
 **/

public class B_SubsetsGeneration {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 1; i <= n ; i++) {
            array[i - 1] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1 ; j < n; j++) {
                System.out.println(10*array[i]+array[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println(100*array[i]+10*array[j]+array[k]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        System.out.println(1000*array[i]+100*array[j]+10*array[k]+array[l]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            System.out.println(10000*array[i]+1000*array[j]+100*array[k]+10*array[l]+array[m]);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            for (int o = m + 1; o < n; o++) {
                                System.out.println(100000*array[i]+10000*array[j]+1000*array[k]+100*array[l]+10*array[m]+array[o]);
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            for (int o = m + 1; o < n; o++) {
                                for (int p = o + 1; p < n; p++) {
                                    System.out.println(1000000*array[i]+100000*array[j]+10000*array[k]+1000*array[l]+100*array[m]+10*array[o]+array[p]);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            for (int o = m + 1; o < n; o++) {
                                for (int p = o + 1; p < n; p++) {
                                    for (int q = p + 1; q < n; q++) {
                                        System.out.println(10000000*array[i]+1000000*array[j]+100000*array[k]+10000*array[l]+1000*array[m]+100*array[o]+10*array[p]+array[q]);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
